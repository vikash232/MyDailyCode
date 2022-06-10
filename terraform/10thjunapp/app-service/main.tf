resource "azurerm_resource_group" "example" {
  name     = var.rgname
  location = var.rglocation
}

resource "azurerm_app_service_plan" "example" {
  name                = var.appsvcplan
  location            = azurerm_resource_group.example.location
  resource_group_name = azurerm_resource_group.example.name

  sku {
    tier = var.tier
    size = var.size
  }
}

resource "azurerm_app_service" "example" {
  name                = var.appsvcname
  location            = azurerm_resource_group.example.location
  resource_group_name = azurerm_resource_group.example.name
  app_service_plan_id = azurerm_app_service_plan.example.id

  site_config {
    always_on                = false
    dotnet_framework_version = "v4.0"
    scm_type                 = "LocalGit"
  }

}

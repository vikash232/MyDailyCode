resource "azurerm_resource_group" "example" {
  name     = var.rgname
  location = var.rglocation
}

resource "azurerm_service_plan" "example" {
  name                = var.appsvcplan
  location            = azurerm_resource_group.example.location
  resource_group_name = azurerm_resource_group.example.name
  os_type             = "Windows"
  sku_name            = "F1"

}

resource "azurerm_windows_web_app" "example" {
  name                = var.appsvcname
  location            = azurerm_resource_group.example.location
  resource_group_name = azurerm_resource_group.example.name
  service_plan_id     = azurerm_service_plan.example.id

  site_config {}

}

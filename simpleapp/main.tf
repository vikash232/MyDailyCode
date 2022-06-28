provider "azurerm" {
  features {}
}

resource "azurerm_resource_group" "example" {
  name     = "vkrg32"
  location = "Australia East"
}

resource "azurerm_app_service_plan" "example" {
  name                = "example-appserviceplan"
  location            = azurerm_resource_group.example.location
  resource_group_name = azurerm_resource_group.example.name

  sku {
    tier = "Free"
    size = "F1"
  }
}

resource "azurerm_app_service" "example" {
  name                = "example-app-svc-vk"
  location            = azurerm_resource_group.example.location
  resource_group_name = azurerm_resource_group.example.name
  app_service_plan_id = azurerm_app_service_plan.example.id

  site_config {
    dotnet_framework_version  = "v4.0"
    scm_type                  = "LocalGit"
    use_32_bit_worker_process = true
  }

}

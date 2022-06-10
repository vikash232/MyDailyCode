# Azurerm Provider configuration
provider "azurerm" {
  features {}
}

resource "azurerm_resource_group" "rg" {
  name     = var.rg_name
  location = var.rg_location
}

module "app-service" {
  # source      = "dfar-io/app-service/azurerm"
  source = "modules/app-service/azurerm"

  name        = var.name
  rg_location = azurerm_resource_group.rg.location
  rg_name     = azurerm_resource_group.rg.name
}

provider "azurerm" {
  features {}
}

module "app-service" {
  source     = "./app-service"
  rgname     = var.rgname
  rglocation = var.rglocation
  appsvcplan = var.appsvcplan
  tier       = var.tier
  size       = var.size
  appsvcname = var.appsvcname
}

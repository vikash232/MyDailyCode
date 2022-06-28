provider "azurerm" {
  features {}
}

module "appsvc" {
  source            = "./appsvc"
  rgname            = var.rgname
  location          = var.location
  vnetname          = var.vnetname
  address_space     = var.address_space
  address_prefixes  = var.address_prefixes
  subnet_name       = var.subnet_name
  delegation_name   = var.delegation_name
  app_svc_plan_name = var.app_svc_plan_name
  size              = var.size
  tier              = var.tier
  app_svc_name      = var.app_svc_name


}

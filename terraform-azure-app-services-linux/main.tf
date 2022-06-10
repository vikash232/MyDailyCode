# ###########################
# ## Azure Provider - Main ##
# ###########################

# # Define Terraform provider
# terraform {
#   required_version = ">= 0.12"
# }

# # Configure the Azure provider
# provider "azurerm" {
#   environment = "public"
#   features {}
# }



module "app-service" {
  source      = "./app-service"
  location    = var.location
  company     = var.company
  owner       = var.owner
  description = var.description
  environment = var.environment
  region      = var.region
  app_name    = var.app_name
  tier        = var.tier
  size        = var.size


}

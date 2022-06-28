##############################
## Azure App Service - Main ##
##############################

# Create a Resource Group
resource "azurerm_resource_group" "appservice-rg" {
  name     = "kohlr-${var.region}-${var.environment}-${var.app_name}-app-service-rg"
  location = var.location

  tags = {
    description = var.description
    environment = var.environment
    owner       = var.owner
  }
}

# Create the App Service Plan
resource "azurerm_app_service_plan" "service-plan" {
  name                = "kohlr-${var.region}-${var.environment}-${var.app_name}-service-plan"
  location            = azurerm_resource_group.appservice-rg.location
  resource_group_name = azurerm_resource_group.appservice-rg.name
  #kind                = "Linux"
  kind     = "Windows"
  reserved = false

  sku {
    # tier = "Standard"
    # size = "S1"
    tier = var.tier
    size = var.size
  }

  tags = {
    description = var.description
    environment = var.environment
    owner       = var.owner
  }
}

# Create the App Service
resource "azurerm_app_service" "app-services" {
  name                = "kohlr-${var.region}-${var.environment}-${var.app_name}-app-service"
  location            = azurerm_resource_group.appservice-rg.location
  resource_group_name = azurerm_resource_group.appservice-rg.name
  app_service_plan_id = azurerm_app_service_plan.service-plan.id

  site_config {
    # linux_fx_version = "DOTNETCORE|3.1"
    dotnet_framework_version = "v4.0"
  }

  tags = {
    description = var.description
    environment = var.environment
    owner       = var.owner
  }
}

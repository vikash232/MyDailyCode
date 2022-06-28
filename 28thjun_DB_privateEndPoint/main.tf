provider "azurerm" {
  features {}
}


module "sql_database" {
  source = "./sqldb_with_pvt_endpoint"

  app_name                = var.app_name
  company                 = var.company
  prefix                  = var.prefix
  location                = var.location
  environment             = var.environment
  kopi-vnet-cidr          = var.kopi-vnet-cidr
  kopi-db-subnet-cidr     = var.kopi-db-subnet-cidr
  kopi-private-dns        = var.kopi-private-dns
  kopi-dns-privatelink    = var.kopi-dns-privatelink
  kopi-sql-admin-username = var.kopi-sql-admin-username
  kopi-sql-admin-password = var.kopi-sql-admin-password


}

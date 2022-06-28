variable "rgname" {
  description = "name of the rg"
  type        = string
  default     = "kholer-rg"
}

variable "location" {
  description = "name of the location"
  type        = string
  default     = "australiaeast"
}

variable "vnetname" {
  description = "name of the virtual network"
  type        = string
  default     = "kholer-rg-vnet"
}

variable "address_space" {
  description = "name of the address space"
  type        = string
  default     = "10.50.0.0/16"
}

variable "subnet_name" {
  description = "name of the subnet"
  type        = string
  default     = "kholer-rg-svc-subnet"
}

variable "delegation_name" {
  description = "name of the delegation"
  type        = string
  default     = "kholer-app-delegation"
}

variable "address_prefixes" {
  description = "name of the address prefix"
  type        = string
  default     = "10.50.2.0/24"
}

variable "app_svc_plan_name" {
  description = "name of the service plan"
  type        = string
  default     = "kholer-rg"
}


variable "tier" {
  description = "name of the tier of appsvc "
  type        = string
  default     = "Standard"
}

variable "size" {
  description = "name of the svc size"
  type        = string
  default     = "S1"
}

variable "app_svc_name" {
  description = "name of the app service"
  type        = string
  default     = "myappsvc"
}

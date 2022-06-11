variable "rglocation" {
  description = "the location of resource group"
  type        = string
  # default     = "australiaeast"
}

variable "rgname" {
  description = "the name of resource group"
  type        = string
  #default     = "vkshiv"
}

variable "vnetname" {
  description = "the name of virtual netwok"
  type        = string
  #default     = "vkvnet"
}

variable "subnettype" {
  description = "the name  of the subnettype"
  type        = string
  # default     = "internal"
}

variable "inetname" {
  description = "the name of the network interface"
  type        = string
  #default     = "vkvnet-nic"
}

variable "vmname" {
  description = "the name of the virtual machine "
  #type        = string
  #default     = "shivvkvm"
}

variable "vmsize" {
  description = "the size of the virtual machine "
  # default     = "Standard_DS1_v2"
}












provider "aws" {
region = "us-east-1"
profile = "default"
}

resource "aws_instance" "webos1" {
  ami           = "ami-0aeeebd8d2ab47354"
  instance_type = "t2.micro"

  tags = {
    Name = "Terraform_os2"
  }
}

output "my_public_ip_is" {
value = aws_instance.webos1.public_ip
}

output "my_az_is" {
value = aws_instance.webos1.availability_zone
}

output "aws_tag_is" {
value = aws_instance.webos1.tags
}
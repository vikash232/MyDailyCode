provider "aws" {
  region = "us-east-1"
  profile = "default"
}



resource "aws_instance" "webos1" {
  ami = "ami-0d5eff06f840b45e9"
  instance_type = "t2.micro"
  security_groups = [ "webport-allow" ]
  key_name = "terraform_key"


  tags = {
    Name = "Web server by tf"
  }

}

resource "null_resource" "nullremote1" {

connection {
    type = "ssh"
    user = "ec2-user"
    private_key =  file("C:/Users/VIKASH KAUSHIK/Downloads/terraform_key.pem")
    host =  aws_instance.webos1.public_ip
  }

provisioner "remote-exec" {
    inline = [
       "sudo yum install httpd -y",
       "sudo yum install php -y",
       " sudo systemctl enable --now httpd",
       " sudo systemctl start httpd",
        ] 
  }


}

resource "aws_ebs_volume" "st1" {
  availability_zone = aws_instance.webos1.availability_zone
  size = 1

  tags = {
    Name = "vk HDD"
  }
}

output "os2" {
value = aws_ebs_volume.st1.id
}

resource "aws_volume_attachment" "ebs_att" {
  device_name = "/dev/sdc"
  volume_id   = aws_ebs_volume.st1.id
  instance_id = aws_instance.webos1.id
  force_detach = true
}

output "os3" {
 value = aws_volume_attachment.ebs_att
 }

resource "null_resource"  "nullremote2" {

connection {
    type = "ssh"
    user = "ec2-user"
    private_key =  file("C:/Users/VIKASH KAUSHIK/Downloads/terraform_key.pem")
    host =  aws_instance.webos1.public_ip
  }

provisioner "remote-exec" {
    inline = [
       "sudo mkfs.ext4 /dev/xvdc",
       "sudo mount /dev/xvdc /var/www/html",
        ] 
  }
}

resource "null_resource"  "nullremote3" {



connection {
    type     = "ssh"
    user     = "ec2-user"
    private_key = file("C:/Users/VIKASH KAUSHIK/Downloads/terraform_key.pem")
    host     = aws_instance.webos1.public_ip
  }

provisioner "remote-exec" {
    inline = [
      "sudo yum install git -y",
      "sudo git clone https://github.com/vimallinuxworld13/gitphptest.git   /var/www/html/web"
    ]
  }

}




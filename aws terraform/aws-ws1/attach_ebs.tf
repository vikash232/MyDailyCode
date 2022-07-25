resource "aws_volume_attachment" "ebs_att" {
  device_name = "/dev/sdc"
  volume_id   = aws_ebs_volume.st1.id
  instance_id = aws_instance.webos1.id
  force_detach = true
}

output "os3" {
 value = aws_volume_attachment.ebs_att
 }


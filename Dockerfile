from centos:7
run yum install httpd -y && \
    yum install net-tools -y
copy ./index.html /var/www/html
cmd ["/usr/sbin/httpd", "-D", "FOREGROUND"]
expose 80
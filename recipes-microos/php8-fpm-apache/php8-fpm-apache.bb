SUMMARY = "Apache configuration for PHP-FPM"
DESCRIPTION = "Configuration for Apache to pass all requests for PHP scripts to the \
PHP-FPM server using reverse proxy."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-fpm-apache-8.2.5-1.1.noarch.rpm"
RPM_HASH = "9f42ec48a600cc8031d1a787d47530d340f27212877c691d5a44f9238d4b187d30af5d5179de9a9394b8d3a1b66ce862dc5435f849e217464c9d4ee0c9d2c890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(php8-fpm-apache) php8-fpm-apache"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/a2enmod apache2 php-fpm"

inherit rpm

SUMMARY = "WordPress command-line interface"
DESCRIPTION = "WP-CLI is the command-line interface for WordPress. You can update plugins, \
configure multisite installations and much more, without using a web browser."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "wp-cli-2.7.1-1.2.noarch.rpm"
RPM_HASH = "12bf0146b24ad219f944497154741e29dfd18569f72ce300ca1fe10654c033c95cb61fa9e1be62ce2de3e4c545fac9eeb5985c2e426eabfe6275104fe8775ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(wp-cli) wp-cli"
RDEPENDS:${PN} += "php php-json php-openssl php-phar php-zip"

inherit rpm

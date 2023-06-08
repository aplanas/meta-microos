SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the base files for all subpackages and \
must be installed in order to use PHP. Additionally, extension \
modules and server modules (e.g. for Apache) may be installed."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "f56279413e3ca6af1caba57e868c806d510b393829c96c68dafb1b0d81fd344999961823604d958f7e41c78dbba3430e94431884444a96c385ae0b18e9f59be0"

RPROVIDES:${PN} += "php php(api) php(zend-abi) php-api php-date php-filter php-hash php-json php-pcre php-reflection php-session php-simplexml php-spl php-xml php-zend-abi php8 php8(aarch-64) zend"
RDEPENDS:${PN} += "php-sapi timezone"

inherit rpm

SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "PHP is a server-side HTML embedded scripting language designed \
primarily for web development but also used as a general-purpose \
programming language. \
 \
This package contains the standard implementation of PHP, namely Zend \
PHP. Included are the PHP command-line binary and the configuration \
file (php.ini). \
 \
Additional documentation is available in package php-doc."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-cli-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "08966ee4b625e5b66f2b02ed89691ec69473981164b213bd4f7a8837a5f57dbef06c106fed8b5f8e1bff44467cb30a836cd89f42b933d27a008d3308bcd415d1"

RPROVIDES:${PN} += "config(php8-cli) \
php-cli \
php-sapi \
php8-cli \
php8-cli(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libargon2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpcre2-8.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.11)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
libxml2.so.2(LIBXML2_2.9.0)(64bit) \
php"

inherit rpm

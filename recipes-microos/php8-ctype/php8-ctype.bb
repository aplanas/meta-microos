SUMMARY = "Character class extension for PHP"
DESCRIPTION = "PHP functions for checking whether a character or string falls into a \
certain character class according to the current locale."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-ctype-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "36cfeaaa8b89a80d64e22107bf758d3dd7e46d588061901363b47181c9f8c3de6bf375b519218a71812b790020bd0a614bdb4b6063edaea1f6f92a1713c6fe03"

RPROVIDES:${PN} += "config(php8-ctype) php-ctype php8-ctype php8-ctype(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm

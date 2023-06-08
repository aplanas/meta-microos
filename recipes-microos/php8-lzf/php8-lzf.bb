SUMMARY = "LZF compression"
DESCRIPTION = "This package handles LZF de/compression."
LICENSE = "PHP-3.01"

PV = "1.7.0"

RPM_NAME = "php8-lzf-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "a435c45038fb5f5ea0dacbd908dcdd0acd79a9b82fa48a38b3093d538a93729541ceabf68e874c7ae18e0796dfa0037fa32de852118457ce4cbecb9b6d41f453"

RPROVIDES:${PN} += "config(php8-lzf) php-lzf php8-lzf php8-lzf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php(api) php(zend-abi)"

inherit rpm

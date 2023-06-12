SUMMARY = "LZF compression"
DESCRIPTION = "This package handles LZF de/compression."
LICENSE = "PHP-3.01"

PV = "1.7.0"

RPM_NAME = "php8-lzf-1.7.0-2.5.aarch64.rpm"
RPM_HASH = "2c7f4944433849a3c8d4f7ab545e13452fbb568fe34429a92fbf9b97090a2f76168a38af0690d051d8616eeae6c9cc42ae7b638e1ff820c4188f9271a9461df5"

RPROVIDES:${PN} += "config(php8-lzf) php-lzf php8-lzf php8-lzf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php(api) php(zend-abi)"

inherit rpm

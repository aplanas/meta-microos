SUMMARY = "Character set conversion functions for PHP"
DESCRIPTION = "This module contains an interface to iconv character set conversion \
facility. With this module, a string represented by a local character \
set can be turned into another character set, which may be the \
Unicode character set. Supported character sets depend on the iconv \
implementation of your system."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-iconv-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "c8546448cebb3243d9a6d82dd6bb13f1dacafd5ee3c8c173af60fbbcfdc9919eb36dc7a64f430de42529fa046ac035e79d6ce561987675dfa4d1f99dc0460529"

RPROVIDES:${PN} += "config(php8-iconv) php-iconv php8-iconv php8-iconv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm

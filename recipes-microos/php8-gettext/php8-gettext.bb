SUMMARY = "Native language support for PHP"
DESCRIPTION = "PHP functions that implement a Native Language Support (NLS) API which \
can be used to internationalize your PHP applications."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-gettext-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "d286338c5d6189cca30387a250875412371445002d67e3be9c8508c2bff4ac9396fbcbce7e5c45edf3d5d4988f868e27d2f0e0ee2771563ff4ce1e4a368d88a1"

RPROVIDES:${PN} += "config(php8-gettext) php-gettext php8-gettext php8-gettext(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm

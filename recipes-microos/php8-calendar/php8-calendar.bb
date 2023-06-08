SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP functions for converting between different calendar formats."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-calendar-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "d40265f834369e1b31183ff7302b116fffc60da657ac079f334d80b57eeea86c3de9bc09294b00d9b1e88f021a028632db079878cd25e68a97486aeba5f763e1"

RPROVIDES:${PN} += "config(php8-calendar) php-calendar php8-calendar php8-calendar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm

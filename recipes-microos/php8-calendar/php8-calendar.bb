SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP functions for converting between different calendar formats."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-calendar-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "ce467b86df4025d01fc0a77e5d7ccef2336ce20dfd6eadd05f45e47f1b9cb0f6b1661b34591f469aaec18678b6b88cd70f8ea577a4d8ec4ff472d16f9b74e818"

RPROVIDES:${PN} += "config(php8-calendar) php-calendar php8-calendar php8-calendar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm

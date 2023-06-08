SUMMARY = "Berkeley sockets API for PHP"
DESCRIPTION = "The socket extension implements a low-level interface to the socket \
communication functions based on the BSD sockets API, providing the \
possibility to act as a socket server as well as a client."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-sockets-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "9a72e3959a793b4cc91ba83e060bf275079431d53f4be4225e5f28f78fac066dff9a1853d6e624517ac435aa76fa586a49d333e162f313fd398bb95ccdefdd07"

RPROVIDES:${PN} += "config(php8-sockets) php-sockets php8-sockets php8-sockets(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) php"

inherit rpm

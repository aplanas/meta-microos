SUMMARY = "PHP libcurl integration"
DESCRIPTION = "PHP interface to libcurl that allows you to connect to and communicate \
with servers of many different types, using protocols of many different \
types."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-curl-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "fd5db7a849cec4f39c4552c1be05c3f43e435ffd22d681a423b8ac1532b695607ec8fa481125d657d6599cda30f2df37b31543dd3df73b7c3e2649ef444f9081"

RPROVIDES:${PN} += "config(php8-curl) php-curl php8-curl php8-curl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcurl.so.4()(64bit) php"

inherit rpm

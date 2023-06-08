SUMMARY = "ZIP archive support for PHP"
DESCRIPTION = "This extension allows to transparently read or write ZIP compressed \
archives and the files inside them."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-zip-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "a2427db2220f94a42980905d2f46e79e7de38e9d7f21187a6983f3cf4789c8a8ef8e62d3e936efbdfe889019269e3f501346973ba3560026bc7a57089a7c0ae3"

RPROVIDES:${PN} += "config(php8-zip) php-zip php8-zip php8-zip(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libzip.so.5()(64bit) php"

inherit rpm

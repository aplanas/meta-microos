SUMMARY = "API for communicating with Redis servers"
DESCRIPTION = "This extension provides an API for communicating with Redis servers"
LICENSE = "PHP-3.01"

PV = "5.3.7"

RPM_NAME = "php8-redis-5.3.7-2.4.aarch64.rpm"
RPM_HASH = "6661b24c4d948f74f7bfdb90c50a9af78e3b1b3cecf49a14f4a6b2bd28a0071659fcd1410b58778e5c9b7257d9769ab66b7fb8646d3f82c0ad3062e6ca3d34b2"

RPROVIDES:${PN} += "config(php8-redis) php-redis php8-redis php8-redis(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php(api) php(zend-abi)"

inherit rpm

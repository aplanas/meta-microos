SUMMARY = "Document Object Model extension for PHP"
DESCRIPTION = "This module adds Document Object Model (DOM) support."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-dom-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "5d561483f59030a819060805071b8c8ba2d60b5164f6fdd343f7148e659d4f7f2488155ffe05b9dade4dd375f2b1d36c0b2567f60e2880f1b298c6491490cb37"

RPROVIDES:${PN} += "config(php8-dom) php-dom php8-dom php8-dom(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.5.4)(64bit) libxml2.so.2(LIBXML2_2.5.7)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.5.9)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.14)(64bit) libxml2.so.2(LIBXML2_2.6.23)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit) php"

inherit rpm

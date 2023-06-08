SUMMARY = "Small Embeddable HTTP Server Library"
DESCRIPTION = "Headers, pkg-config files, so link and other development files for libmicrohttpd \
(Small Embeddable HTTP Server Library)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.76"

RPM_NAME = "libmicrohttpd-devel-0.9.76-1.3.aarch64.rpm"
RPM_HASH = "aa6a1fb09af8eafb0f73f6b2c5dd5a721c170c1fe75b806ff48b376ad7acbb6512137c03a296bcb16e2d3feff54babd1478ee10235f5d1bbe725c3cc217c9035"

RPROVIDES:${PN} += "libmicrohttpd-devel libmicrohttpd-devel(aarch-64) pkgconfig(libmicrohttpd)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmicrohttpd12 pkgconfig pkgconfig(gnutls)"

inherit rpm

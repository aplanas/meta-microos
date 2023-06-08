SUMMARY = "Development files for the SPDY C Library"
DESCRIPTION = "This is an experimental implementation of Google’s SPDY protocol in \
C. This library provides SPDY version 2, 3 and 3.1 framing layer \
implementation. It does not perform any I/O operations but uses \
callback functions provided by the application. Likewise, it includes \
no event polling mechanism, so the application can freely choose. \
There is no dependency on a particular SSL library. \
 \
This package holds the development files."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "spdylay-devel-1.4.0-3.26.aarch64.rpm"
RPM_HASH = "674e7796b915fa3000ef71406094a565ec0869a329be4225bab22c7bd736c475e24d90fb143002efc0014743071becc997d1048b98d614396ca883500aab58ed"

RPROVIDES:${PN} += "pkgconfig(libspdylay) spdylay-devel spdylay-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libspdylay7 pkgconfig(zlib)"

inherit rpm

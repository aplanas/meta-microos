SUMMARY = "Development files for the ICU library"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the headers for ICU."
LICENSE = "ICU"

PV = "72.1"

RPM_NAME = "libicu-devel-72.1-2.3.aarch64.rpm"
RPM_HASH = "360693749078c16c907d582a896de3158f34609734df9206787254a9b393ad0253957fd5cc2a477262308a50fc0bf2584f445730a93f82d3cfcc9d28ab094f6a"

RPROVIDES:${PN} += "libicu-devel libicu-devel(aarch-64) pkgconfig(icu-i18n) pkgconfig(icu-io) pkgconfig(icu-uc)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libicu72 pkgconfig(icu-i18n) pkgconfig(icu-uc)"

inherit rpm

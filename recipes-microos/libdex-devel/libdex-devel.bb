SUMMARY = "Development files for libdex"
DESCRIPTION = "This package contains the libraries and header files that are \
needed for writing applications with libdex."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "libdex-devel-0.2.0-1.1.aarch64.rpm"
RPM_HASH = "c091d70744772a39e21ec9416e997ce8589f551d6b7251d57e1bd8898ccd3a1eaacf251cdb24f20c882a1acc68b5cf28ce8081786a4386d34d9dd2101c389212"

RPROVIDES:${PN} += "libdex-devel \
libdex-devel(aarch-64) \
pkgconfig(libdex-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdex-1-1 \
pkgconfig(gio-2.0) \
typelib-1_0-Dex-1_0"

inherit rpm

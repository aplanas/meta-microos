SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng16-compat-devel package contains unversioned symlinks \
to the header files, libraries, configuration files and development \
tools necessary for compiling and linking programs that don't care \
about libpng version."
LICENSE = "libpng-2.0"

PV = "1.6.39"

RPM_NAME = "libpng16-compat-devel-1.6.39-3.1.aarch64.rpm"
RPM_HASH = "a83be759e12d381f9561f9ed4b652f17956ff21741422990f388bec27e3a86a51314b525c13ff20255a60648d1cee913a31e18c7263c94d08df61ad26540e9ae"

RPROVIDES:${PN} += "libpng-devel libpng16-compat-devel libpng16-compat-devel(aarch-64) pkgconfig(libpng)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpng16-devel pkgconfig(zlib)"

inherit rpm

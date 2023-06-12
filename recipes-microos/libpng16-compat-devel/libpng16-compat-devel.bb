SUMMARY = "Development tools for applications which will use libpng"
DESCRIPTION = "The libpng16-compat-devel package contains unversioned symlinks \
to the header files, libraries, configuration files and development \
tools necessary for compiling and linking programs that don't care \
about libpng version."
LICENSE = "libpng-2.0"

PV = "1.6.39"

RPM_NAME = "libpng16-compat-devel-1.6.39-4.1.aarch64.rpm"
RPM_HASH = "7e87bd999f3dd6044eac3e1ea71dbbe751e27aaf87c4eac9e1188f7f0a23d2630c2571dc86e2dc65b311854486511c33251244a13f9fe538110a132bddb1c4b0"

RPROVIDES:${PN} += "libpng-devel \
libpng16-compat-devel \
libpng16-compat-devel(aarch-64) \
pkgconfig(libpng)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpng16-devel \
pkgconfig(zlib)"

inherit rpm

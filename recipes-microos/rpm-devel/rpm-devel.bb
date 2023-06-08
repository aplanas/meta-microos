SUMMARY = "Development files for librpm"
DESCRIPTION = "This package contains the RPM C library and header files.  These \
development files will simplify the process of writing programs which \
manipulate RPM packages and databases and are intended to make it \
easier to create graphical package managers or any other tools that \
need an intimate knowledge of RPM packages in order to function."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-devel-4.18.0-4.3.aarch64.rpm"
RPM_HASH = "f6f9ecffc7f1ec4fc0f007cec5b25d9a153bc960bc3a24cd7db3c6f403554624aa66053a5e900d4e2091d3aa349db761f6ecda6d917028790263dc87b91e103e"

RPROVIDES:${PN} += "pkgconfig(rpm) rpm-devel rpm-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(libzstd) pkgconfig(popt) popt-devel rpm"

inherit rpm

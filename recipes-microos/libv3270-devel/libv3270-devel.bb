SUMMARY = "Header files for the 3270 Virtual Terminal library"
DESCRIPTION = "Originally designed as part of the pw3270 application, this package provides the development files required to libv3270."
LICENSE = "LGPL-3.0-only"

PV = "5.4"

RPM_NAME = "libv3270-devel-5.4-1.9.aarch64.rpm"
RPM_HASH = "e94ca74597abee11012145ed405ba3116112dcbd3b6c9633bd6791804838294aabda4cd6b16639c7ea617015b273a158b9f3d2d13a31dabdaa9b870945bdcc5c"

RPROVIDES:${PN} += "libv3270-devel \
libv3270-devel(aarch-64) \
pkgconfig(libv3270)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libv3270-5_4 \
pkgconfig(gtk+-3.0) \
pkgconfig(lib3270)"

inherit rpm

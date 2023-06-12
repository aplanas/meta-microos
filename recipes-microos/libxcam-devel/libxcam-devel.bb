SUMMARY = "Development files for libxcam"
DESCRIPTION = "The libxcam-devel package contains libraries and header files for \
developing applications that use libxcam."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "libxcam-devel-1.5.0-4.5.aarch64.rpm"
RPM_HASH = "cd5966518e70b6053e789e5522d1c46d97f937d723c5fbefe1fc42b161ab6374817859285d8bd0a914e3c1c592dcb6e964b27af3e89226c3e13f15fc90fdd7fd"

RPROVIDES:${PN} += "libxcam-devel \
libxcam-devel(aarch-64) \
pkgconfig(libxcam)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcam1"

inherit rpm

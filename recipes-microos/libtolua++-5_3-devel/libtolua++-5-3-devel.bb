SUMMARY = "Development headers for tolua++"
DESCRIPTION = "This package provides development headers for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_3-devel-1.0.93-10.2.aarch64.rpm"
RPM_HASH = "24e564fa7697294a380c37444a6b6f3d4bbdcf4b308111c00b2153abccd4d6538a10488448affedfaa5c801cfa9812bcb962328c4414aac30088e55882dfce42"

RPROVIDES:${PN} += "libtolua++-5_3-devel \
libtolua++-5_3-devel(aarch-64) \
pkgconfig(tolua++) \
toluapp-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
toluapp-5.3"

inherit rpm

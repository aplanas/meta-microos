SUMMARY = "Development headers for tolua++"
DESCRIPTION = "This package provides development headers for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_4-devel-1.0.93-10.2.aarch64.rpm"
RPM_HASH = "53157886401e4a0b51d6d221e90ac3750f9c2ecfb4aa4f53dee524964273028cef6f10b92e287dfb00443213ed7a43d6623b2c8dfa3f08ea20924f9c7e714297"

RPROVIDES:${PN} += "libtolua++-5_4-devel \
libtolua++-5_4-devel(aarch-64) \
pkgconfig(tolua++) \
toluapp-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
toluapp-5.4"

inherit rpm

SUMMARY = "X Window System"
DESCRIPTION = "The 32bit pattern complementing x11_enhanced."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11_enhanced-32bit-20200505-40.1.aarch64.rpm"
RPM_HASH = "8bed915c498620e913484e3ccd749c8d2d589c8b0295d5d01a85c5edac1ea2ef1ab76c1d104952bc87ec3ea0dccd33ecbb03bc45c5b593adf9ba158f6fb918a0"

RPROVIDES:${PN} += "pattern() patterns-base-x11_enhanced-32bit patterns-base-x11_enhanced-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

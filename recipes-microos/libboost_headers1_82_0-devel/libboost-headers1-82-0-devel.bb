SUMMARY = "Development headers for Boost"
DESCRIPTION = "A collection of header-only libraries for Boost."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_headers1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "81a425999eb2ae634eb3fc87d2e30e6e491eaa4509a57daf0b17da60ef41ebaafe9774fb7f15c7f62f172d404d850a43a00971922aa74f5dedb897fbab2a2ef6"

RPROVIDES:${PN} += "libboost_headers-devel-impl libboost_headers1_82_0-devel libboost_headers1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "boost-license1_82_0 libstdc++-devel"

inherit rpm

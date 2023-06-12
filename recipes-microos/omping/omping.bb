SUMMARY = "Utility to test IP multicast functionality"
DESCRIPTION = "Omping (Open Multicast Ping) is tool to test IP multicast functionality \
primarily in local network."
LICENSE = "ISC"

PV = "0.0.5"

RPM_NAME = "omping-0.0.5-2.7.aarch64.rpm"
RPM_HASH = "fc5bdd36129a02e29a49ab77e963ca8a690ed297aec5098e3a39c94b2388c6e77468d21bfadc43fd3c9255783843d05cbe4b243fbfffd4c320a53cd85e609f39"

RPROVIDES:${PN} += "omping \
omping(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

SUMMARY = "A utility to perform process operations"
DESCRIPTION = "The prctl utility allows a user to control certain process behaviors in \
the runtime environment."
LICENSE = "GPL-2.0+"

PV = "1.6"

RPM_NAME = "prctl-1.6-4.25.aarch64.rpm"
RPM_HASH = "5cd2d3782eab0a33f1fe54bc1f667a2b1f4e88fd6683faf199fc9c40998f48992a6b20c40cf87b666a304f8a860e6f2a5de2a9b5ea7363c69f152062804cdc8d"

RPROVIDES:${PN} += "prctl \
prctl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

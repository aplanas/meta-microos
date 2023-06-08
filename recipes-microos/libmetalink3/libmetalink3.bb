SUMMARY = "Metalink Library"
DESCRIPTION = "Libmetalink is a Metalink library written in C language. It is intended to \
provide the programs written in C to add Metalink functionality such as parsing \
Metalink XML files."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "libmetalink3-0.1.3-3.19.aarch64.rpm"
RPM_HASH = "bafb7fe879225ffa12ccda1260da13feb92d2f97636c417a40897755434bed5eb2a6adbb1d0fc3633ed33cd217f85572c3a1ca1c713cff7802b0e4d1da2d8ff5"

RPROVIDES:${PN} += "libmetalink.so.3()(64bit) libmetalink3 libmetalink3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libexpat.so.1()(64bit)"

inherit rpm

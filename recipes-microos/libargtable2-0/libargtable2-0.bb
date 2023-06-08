SUMMARY = "Command line parsing library"
DESCRIPTION = "The libargtable2 package contains libraries for libargtable."
LICENSE = "LGPL-2.0+"

PV = "2.13"

RPM_NAME = "libargtable2-0-2.13-2.23.aarch64.rpm"
RPM_HASH = "77a362e198967856590a2e34716522c96b3c46846c097ec85a9889b77674d3039925bef31412845e34a88d040d1bb324e85aa24f708d68e88412dfcb68ae5cdb"

RPROVIDES:${PN} += "libargtable2-0 libargtable2-0(aarch-64) libargtable2.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

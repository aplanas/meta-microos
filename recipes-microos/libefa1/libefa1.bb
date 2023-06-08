SUMMARY = "EFA runtime library"
DESCRIPTION = "This package contains the efa runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "libefa1-42.0-2.3.aarch64.rpm"
RPM_HASH = "2573222e156a7c7fa91e021decc2ebeadb1a96a6351e5e5fc2eaf2656b000b718ed2a38ec863e4c923c490fd3c8ee2a4292d1bc47816642975c3be7199df9892"

RPROVIDES:${PN} += "libefa.so.1()(64bit) libefa.so.1(EFA_1.0)(64bit) libefa.so.1(EFA_1.1)(64bit) libefa1 libefa1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_PRIVATE_34)(64bit)"

inherit rpm

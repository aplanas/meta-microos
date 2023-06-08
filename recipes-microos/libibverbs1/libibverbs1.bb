SUMMARY = "Ibverbs runtime library"
DESCRIPTION = "This package contains the ibverbs runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "libibverbs1-42.0-2.3.aarch64.rpm"
RPM_HASH = "cf3b5e0960edc14fda54ae8dd56a1480a76cc4ec35b4d37d8892ef1fb21daa26797a33f4b6bffcb85375eeceda0322c303dd917d8c0b82a8679ae1e962f42fd2"

RPROVIDES:${PN} += "libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libibverbs.so.1(IBVERBS_1.10)(64bit) libibverbs.so.1(IBVERBS_1.11)(64bit) libibverbs.so.1(IBVERBS_1.12)(64bit) libibverbs.so.1(IBVERBS_1.13)(64bit) libibverbs.so.1(IBVERBS_1.14)(64bit) libibverbs.so.1(IBVERBS_1.5)(64bit) libibverbs.so.1(IBVERBS_1.6)(64bit) libibverbs.so.1(IBVERBS_1.7)(64bit) libibverbs.so.1(IBVERBS_1.8)(64bit) libibverbs.so.1(IBVERBS_1.9)(64bit) libibverbs.so.1(IBVERBS_PRIVATE_34)(64bit) libibverbs1 libibverbs1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibverbs libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-route-3.so.200()(64bit) libnl-route-3.so.200(libnl_3)(64bit)"

inherit rpm

SUMMARY = "Examples for the libibverbs library"
DESCRIPTION = "Useful libibverbs example programs such as ibv_devinfo, which \
displays information about RDMA devices."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "libibverbs-utils-42.0-2.3.aarch64.rpm"
RPM_HASH = "cadba886a2b14e9a9bd05b439c967f42ac83a3e05622486207699b7ca55c0d3bc3522975baeb4025ef75b586b07c1145a13b9dfb4bb5be0ad316480fb7e800ba"

RPROVIDES:${PN} += "libibverbs-utils libibverbs-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibverbs(aarch-64) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libibverbs.so.1(IBVERBS_1.6)(64bit) libibverbs.so.1(IBVERBS_PRIVATE_34)(64bit)"

inherit rpm

SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libitm1-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "afbc2e406b7307b704c2244348686c6511ed610f751c31e5ab51584f834b63a4d2ea2d74938c95c29c486000b45ad56e2513edd9bb9907f10c93e8842fe227b5"

RPROVIDES:${PN} += "libitm.so.1()(64bit) libitm.so.1(LIBITM_1.0)(64bit) libitm.so.1(LIBITM_1.1)(64bit) libitm1 libitm1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

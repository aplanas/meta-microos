SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.11.2"

RPM_NAME = "python311-dbm-3.11.2-1.2.aarch64.rpm"
RPM_HASH = "fb9d9e004a436a0209ed5f3690a7890327c7d40c63e50c9f6b9264ed1a10acb0265e4e692923abfc1ff5cf46f24c70898963a7b3e7a822bb09da291c9025a2b4"

RPROVIDES:${PN} += "python311-dbm python311-dbm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdbm.so.6()(64bit) libgdbm_compat.so.4()(64bit) python(abi) python311"

inherit rpm

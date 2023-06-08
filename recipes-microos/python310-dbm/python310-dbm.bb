SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.10.10"

RPM_NAME = "python310-dbm-3.10.10-2.3.aarch64.rpm"
RPM_HASH = "ad7b8f44cf73a8a41a71f6dda526db7bd89ed6fde233c8ce6a982e7ee2c5f41c22b161bcfa04fb7c8b63eb8f5add4fae0f20d42520a34a6fbe0d90106fe314b1"

RPROVIDES:${PN} += "python3-dbm python310-dbm python310-dbm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdbm.so.6()(64bit) libgdbm_compat.so.4()(64bit) python(abi) python310"

inherit rpm

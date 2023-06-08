SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-dbm-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "dc12a67ee515dbe625e1bb0ff7d2df7e0ceb4680c3091c12baa05f969155a89182becec50ca71644ace98b4f07a5845b3cec54e6635deb05136e3336bfacf584"

RPROVIDES:${PN} += "python39-dbm python39-dbm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdbm.so.6()(64bit) libgdbm_compat.so.4()(64bit) python(abi) python39"

inherit rpm

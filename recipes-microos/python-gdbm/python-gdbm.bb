SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for GDBM databases. GDBM is the GNU \
implementation of the standard Unix DBM databases."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-gdbm-2.7.18-33.1.aarch64.rpm"
RPM_HASH = "2d99c4b4e3011af7ba72c3c28c9045002a311ace8f7d741df0a61085c8092b76320e5e86065dbb543a53166d61791d2801e8b35cdffa3b9b621186d902483696"

RPROVIDES:${PN} += "pygdmod python-dbm python-gdbm python-gdbm(aarch-64) python2-dbm python2-gdbm"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdbm.so.6()(64bit) libgdbm_compat.so.4()(64bit) libpython2.7.so.1.0()(64bit) python-base"

inherit rpm

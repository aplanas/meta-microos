SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "libsynctex2-1.21-89.1.aarch64.rpm"
RPM_HASH = "66570882e6d108afaa79b59243767847cb1b7c36945d3a1293b5f5eff54dce620b1da61ef051e7f1541b8890df1da03b19304e3b31635008c8c8d6f357b267de"

RPROVIDES:${PN} += "libsynctex.so.2()(64bit) libsynctex2 libsynctex2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libz.so.1()(64bit)"

inherit rpm

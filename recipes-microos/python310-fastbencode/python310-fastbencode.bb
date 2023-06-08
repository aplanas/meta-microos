SUMMARY = "Implementation of the bencode serialization format"
DESCRIPTION = "fastbencode is an implementation of the bencode serialization format \
originally used by BitTorrent. \
 \
The package includes both a pure-Python version and an optional C extension \
based on Cython. Both provide the same functionality, but the C extension \
provides significantly better performance."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "python310-fastbencode-0.2-1.5.aarch64.rpm"
RPM_HASH = "b2bd1e5271546f2c70292ace43d97e7c73a271eb57495800d0262b903339d3ec77b03c21db82172626087b09767344411018618c27a85f1e5b51962bf959ec9b"

RPROVIDES:${PN} += "python3-fastbencode python3.10dist(fastbencode) python310-fastbencode python310-fastbencode(aarch-64) python3dist(fastbencode)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm

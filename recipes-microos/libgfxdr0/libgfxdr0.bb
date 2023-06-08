SUMMARY = "GlusterFS's External Data Representation library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfxdr0-11.0-1.3.aarch64.rpm"
RPM_HASH = "6e83752870aac364a800be839a24be148342733befdfe0ee8d7bd9c97942149a4660ceb811127e51dc11ea5bb10f1fd0790d2135ab40e7454e05186ed10eeb4a"

RPROVIDES:${PN} += "libgfxdr.so.0()(64bit) libgfxdr0 libgfxdr0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit)"

inherit rpm

SUMMARY = "Library and tools to access the Apple Partition Map volume system format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "python39-libvsapm-20210626-4.7.aarch64.rpm"
RPM_HASH = "2d260720b97baf6434d9e5055ccd766455941cf291c2d1269d6c1c3181b37ac5812709ffed381e22dc3453de12cc0d9142554e80e828155ac509de77e8ed24e3"

RPROVIDES:${PN} += "python39-libvsapm python39-libvsapm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libvsapm.so.1()(64bit) libvsapm.so.1(V_20210626)(64bit) python(abi)"

inherit rpm

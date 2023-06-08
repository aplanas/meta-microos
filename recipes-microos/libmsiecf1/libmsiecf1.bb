SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf1-20221024-3.5.aarch64.rpm"
RPM_HASH = "0298ce7a4d4a024f7468be3c36a39c6ddb7baadcbc4b971fc93378a1854627d119de6216bd1bc79a48f7b42c878e541c9b27005ae79e4963d2818fb8047d42e8"

RPROVIDES:${PN} += "libmsiecf.so.1()(64bit) libmsiecf.so.1(V_20221024)(64bit) libmsiecf1 libmsiecf1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcthreads.so.1()(64bit) libcthreads.so.1(V_20220102)(64bit) libfvalue.so.1()(64bit) libfvalue.so.1(V_20220120)(64bit)"

inherit rpm

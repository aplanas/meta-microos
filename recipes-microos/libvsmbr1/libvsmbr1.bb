SUMMARY = "Library for accessing the MS-DOS partition table format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "libvsmbr1-20210509-4.7.aarch64.rpm"
RPM_HASH = "187d5669025a22dfb8f0e2014231d6a7bfeec5343a3f7ca55f26a705400619dad611e092de96b2d0f1b7a54464dfe86d69764101edd1f41fab5188da5968f34b"

RPROVIDES:${PN} += "libvsmbr.so.1()(64bit) libvsmbr.so.1(V_20210509)(64bit) libvsmbr1 libvsmbr1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcthreads.so.1()(64bit) libcthreads.so.1(V_20220102)(64bit) libfcache.so.1()(64bit) libfcache.so.1(V_20230115)(64bit) libfdata.so.1()(64bit) libfdata.so.1(V_20230319)(64bit)"

inherit rpm

SUMMARY = "Library for accessing Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Supported formats include: \
 \
* Sparse bundle disk image \
* Sparse disk image \
* Universal Disk Image Format (UDIF) image \
  * uncompressed \
  * ADC compressed \
  * bzip2 compressed \
  * LZMA compressed \
  * zlib/DEFLATE compressed"
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi1-20221023-3.7.aarch64.rpm"
RPM_HASH = "ae6487a346b394864d9182746b0a33bffad286ec1135d508b5d048814732ce9a83ebad37fa96d76bba2f4e0182d58f457e03774b92babaa4286614c9e653ba7c"

RPROVIDES:${PN} += "libmodi.so.1()(64bit) libmodi.so.1(V_20221023)(64bit) libmodi1 libmodi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcdirectory.so.1()(64bit) libcdirectory.so.1(V_20220105)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libcfile.so.1()(64bit) libcfile.so.1(V_20220106)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcpath.so.1()(64bit) libcpath.so.1(V_20220108)(64bit) libcthreads.so.1()(64bit) libcthreads.so.1(V_20220102)(64bit) libfcache.so.1()(64bit) libfcache.so.1(V_20230115)(64bit) libfdata.so.1()(64bit) libfdata.so.1(V_20230319)(64bit) libfmos.so.1()(64bit) libfmos.so.1(V_20220811)(64bit) libfplist.so.1()(64bit) libfplist.so.1(V_20220116)(64bit) libfvalue.so.1()(64bit) libfvalue.so.1(V_20220120)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit) libz.so.1()(64bit)"

inherit rpm

SUMMARY = "Library to access the Extended File System (ext)"
DESCRIPTION = "libfsext is a library to access the Extended File System (ext). \
 \
Read-only supported ext formats: \
 \
* ext2 (version 2) \
* ext3 (version 3) \
* ext4 (version 4) \
 \
Supported ext format features: \
 \
* ext4 inline data \
 \
Unsupported ext format features: \
 \
* ext (version 1) \
* compression \
* encryption"
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsext1-20220829-3.9.aarch64.rpm"
RPM_HASH = "6dd933c357ed0fa972c2655a4cd70c5afd6a5225f04a7a5d2ff28e59853a75a308cdb964d3a9f08d34b3f1e5b11bfa1cdff12f2bc98de23981a218117dc1fe54"

RPROVIDES:${PN} += "libfsext.so.1()(64bit) libfsext.so.1(V_20220829)(64bit) libfsext1 libfsext1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcthreads.so.1()(64bit) libcthreads.so.1(V_20220102)(64bit) libfcache.so.1()(64bit) libfcache.so.1(V_20230115)(64bit) libfdata.so.1()(64bit) libfdata.so.1(V_20230319)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm

SUMMARY = "Library for access the Apple File System (APFS)"
DESCRIPTION = "libfsapfs1 is a library for access the Apple File System (APFS)."
LICENSE = "LGPL-3.0-only"

PV = "20221102"

RPM_NAME = "libfsapfs1-20221102-3.11.aarch64.rpm"
RPM_HASH = "de7133572d38812015f3cbe9eceb337bf32691fd9b904c6a17c2ea574b37ccfc84a8851dc33a48c8855c623a6ca68a9cde0bb1c41e4dcfd3b774f2b22ff04bb2"

RPROVIDES:${PN} += "libfsapfs.so.1()(64bit) \
libfsapfs.so.1(V_20221102)(64bit) \
libfsapfs1 \
libfsapfs1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcaes.so.1()(64bit) \
libcaes.so.1(V_20230406)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcthreads.so.1()(64bit) \
libcthreads.so.1(V_20220102)(64bit) \
libfcache.so.1()(64bit) \
libfcache.so.1(V_20230115)(64bit) \
libfdata.so.1()(64bit) \
libfdata.so.1(V_20230319)(64bit) \
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfmos.so.1()(64bit) \
libfmos.so.1(V_20220811)(64bit) \
libhmac.so.1()(64bit) \
libhmac.so.1(V_20230407)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit) \
libz.so.1()(64bit)"

inherit rpm

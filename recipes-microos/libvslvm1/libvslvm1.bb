SUMMARY = "Library to access Linux Logical Volume Manager (LVM) volume containers"
DESCRIPTION = "The libvslvm library is a library to access Linux Logical Volume \
Manager (LVM) volume containers"
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm1-20221025-3.7.aarch64.rpm"
RPM_HASH = "5a667e8bb7daa67f09be0a029fc052229118ef89408d0ca3a8065aa67e435f3bee6503aa742d3cb47d3366c185a0f38dbf6b0cf0b89667df245272d00844aa7d"

RPROVIDES:${PN} += "libvslvm.so.1()(64bit) libvslvm.so.1(V_20221025)(64bit) libvslvm1 libvslvm1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcsplit.so.1()(64bit) libcsplit.so.1(V_20220109)(64bit) libcthreads.so.1()(64bit) libcthreads.so.1(V_20220102)(64bit) libfcache.so.1()(64bit) libfcache.so.1(V_20230115)(64bit) libfdata.so.1()(64bit) libfdata.so.1(V_20230319)(64bit) libfvalue.so.1()(64bit) libfvalue.so.1(V_20220120)(64bit)"

inherit rpm

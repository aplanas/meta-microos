SUMMARY = "Library to access the Windows SuperFetch database format"
DESCRIPTION = "libagdb is a library to access the SuperFetch database format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb1-20210429-3.5.aarch64.rpm"
RPM_HASH = "e62870a95bb618204b5630dc96c11df01825cb12cfd04a71a409ab701064ce4a12d4c6699c7d34bfe9d9472f619eda9ce5ee8eb7ec4eed1065375b89331a84df"

RPROVIDES:${PN} += "libagdb.so.1()(64bit) libagdb.so.1(V_20210429)(64bit) libagdb1 libagdb1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfcache.so.1()(64bit) libfcache.so.1(V_20230115)(64bit) libfdata.so.1()(64bit) libfdata.so.1(V_20230319)(64bit) libfwnt.so.1()(64bit) libfwnt.so.1(V_20220922)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm

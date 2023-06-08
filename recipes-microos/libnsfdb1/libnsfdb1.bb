SUMMARY = "Library for accessing the Notes Storage Facility format"
DESCRIPTION = "libnsfdb is a library to access the Notes Storage Facility (NSF) \
database file format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210419"

RPM_NAME = "libnsfdb1-20210419-3.5.aarch64.rpm"
RPM_HASH = "68616d8babe59898e48576c267f9c3976f9d2e8615e954e9a68eac8a550d29ff45c6d5e46adbb373ba33d6b8a70842eb6dc10df65aaf51de65b659490da4e69d"

RPROVIDES:${PN} += "libnsfdb.so.1()(64bit) libnsfdb.so.1(V_20210419)(64bit) libnsfdb1 libnsfdb1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfcache.so.1()(64bit) libfcache.so.1(V_20230115)(64bit) libfdata.so.1()(64bit) libfdata.so.1(V_20230319)(64bit)"

inherit rpm

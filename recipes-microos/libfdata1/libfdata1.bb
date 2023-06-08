SUMMARY = "Library to provide generic file data functions"
DESCRIPTION = "Library to provide generic file data functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libfdata1-20230319-1.1.aarch64.rpm"
RPM_HASH = "f858a68fd95201272c2e0db272abf1d76ffe3ce8206a1e1a97f7fbfe73dddb043e67ddad2f4dcab8c7e1d50e1cca44a40cd32c9634ed3baab072032d1fb4f93b"

RPROVIDES:${PN} += "libfdata.so.1()(64bit) libfdata.so.1(V_20230319)(64bit) libfdata1 libfdata1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfcache.so.1()(64bit) libfcache.so.1(V_20230115)(64bit)"

inherit rpm

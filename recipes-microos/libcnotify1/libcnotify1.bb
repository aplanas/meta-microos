SUMMARY = "Library for C notify functions"
DESCRIPTION = "A library for C notify functions."
LICENSE = "LGPL-3.0-or-later"

PV = "20220108"

RPM_NAME = "libcnotify1-20220108-3.2.aarch64.rpm"
RPM_HASH = "8386320262e6919b74d8a215e53b2067e973985909248643c97cf8c2123ec10f81f801cc6957246f77446d0c64d6dc8ed091b7ca7e546e3a066681b93a06018e"

RPROVIDES:${PN} += "libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcnotify1 libcnotify1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit)"

inherit rpm

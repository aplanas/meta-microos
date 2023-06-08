SUMMARY = "Tools to scan for binary signatures"
DESCRIPTION = "Tools to scan binary files for signatures."
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "libsigscan-tools-20230109-1.4.aarch64.rpm"
RPM_HASH = "6ef3aa7b1e9ed863e7a6b9d4ef43fd64c2fae3ada3f0e22c3587fe288c54c1161ecc7ef532abbddbafae104920c94d85127b35e11e5151d5f56356fdbe38020d"

RPROVIDES:${PN} += "config(libsigscan-tools) libsigscan-tools libsigscan-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libcfile.so.1()(64bit) libcfile.so.1(V_20220106)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libsigscan.so.1()(64bit) libsigscan.so.1(V_20230109)(64bit) libsigscan1"

inherit rpm

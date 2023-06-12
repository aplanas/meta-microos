SUMMARY = "Library for ESRI Shapefile Handling"
DESCRIPTION = "The Shapefile C Library provides the ability to write simple C programs for \
reading, writing and updating (to a limited extent) ESRI Shapefiles, and the \
associated attribute file (.dbf). \
 \
This package contains the executable programs."
LICENSE = "GPL-2.0-or-later & (LGPL-2.0-or-later | MIT) & SUSE-Public-Domain"

PV = "1.5.0"

RPM_NAME = "shapelib-1.5.0-2.7.aarch64.rpm"
RPM_HASH = "8ebdd46001f21b8ff59a56e69efc7c4854bcf3386d90eb50c4185dc1ac78665bd1b952bb0587f20e6566c84fa957c79fc468e8fa7c852f5b5f2dd2ef5ea630e9"

RPROVIDES:${PN} += "shapelib \
shapelib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libshp.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

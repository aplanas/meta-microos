SUMMARY = "A PAR 2.0 compatible file creation, verification, and repair tool"
DESCRIPTION = "par2cmdline is a program for creating and using PAR2 files to detect damage in \
data files and repair them if necessary. It can be used with any kind of file."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.1"

RPM_NAME = "par2cmdline-0.8.1-2.11.aarch64.rpm"
RPM_HASH = "dd1b0d8fe45948eeb26ffc43fa60150729787a96d1ce1177e8d17f9d4af216885b171b6311a4860628de0d304ec9df78edfbc9e58b5627ad940710b76caa9ed4"

RPROVIDES:${PN} += "par \
par2 \
par2cmdline \
par2cmdline(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

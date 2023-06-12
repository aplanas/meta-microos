SUMMARY = "Utility library around OpenAL"
DESCRIPTION = "ALURE is a utility library to help manage common tasks with OpenAL \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "libalure1-1.2-4.4.aarch64.rpm"
RPM_HASH = "d84a64f60cd5e7c1f4aef390b94ab8960f97e1c3a6f54e0ad25f320ea00b12681b47fe5b3154716d452a31c03cc35537bb4e28db35c1283ff163f4b02f7f595d"

RPROVIDES:${PN} += "libalure.so.1()(64bit) \
libalure.so.1(LIBALURE_1.0)(64bit) \
libalure.so.1(LIBALURE_1.1)(64bit) \
libalure.so.1(LIBALURE_1.2)(64bit) \
libalure1 \
libalure1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdumb.so.2()(64bit) \
libfluidsynth.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmodplug.so.1()(64bit) \
libmpg123.so.0()(64bit) \
libopenal.so.1()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm

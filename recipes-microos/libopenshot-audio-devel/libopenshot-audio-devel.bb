SUMMARY = "Development files for libopenshot-audio"
DESCRIPTION = "The OpenShot Audio Library. \
 \
This package contains header files and libraries needed to develop \
application that use libopenshot-audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libopenshot-audio-devel-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "7fd0275833c5a6937630eceb8f06cc43a80266d706d26f6e03aa13a7f6068740d33f181390893a0cd3cd80ab9b83309ab2fa55275a7d5b32b75d8b1aad53359c"

RPROVIDES:${PN} += "cmake(OpenShotAudio) \
libopenshot-audio-devel \
libopenshot-audio-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libopenshot-audio.so.9()(64bit) \
libopenshot-audio9 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

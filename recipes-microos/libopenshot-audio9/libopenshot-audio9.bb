SUMMARY = "Audio library for the OpenShot video editor"
DESCRIPTION = "The OpenShot Audio Library allows editing and playback of audio. \
It was derived from the JUCE library. \
 \
This package contains the shared library."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "libopenshot-audio9-0.3.1-1.1.aarch64.rpm"
RPM_HASH = "898910bf782f4d321014990352c2dc15906759377ca9624d2623f4fd00913d9974603124d6b622aaf7449a09da3e5d276ea55bdcd28a29f6eddb2df54bc29624"

RPROVIDES:${PN} += "libopenshot-audio.so.9()(64bit) libopenshot-audio9 libopenshot-audio9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm

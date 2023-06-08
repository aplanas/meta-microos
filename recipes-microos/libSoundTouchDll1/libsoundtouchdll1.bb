SUMMARY = "Audio Processing Library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "libSoundTouchDll1-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "8d927aec5467bae1436cda18cd943775b4a2ad628a56a8241fee60fedc76c1bd0d00581e7e327df1290da0dd4ef5de2396c16b9b20fd96cf5294b593b34cd5f0"

RPROVIDES:${PN} += "libSoundTouchDll.so.1()(64bit) libSoundTouchDll1 libSoundTouchDll1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm

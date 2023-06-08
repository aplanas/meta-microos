SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes the ALSA Sequencer library classes, providing MIDI \
recording and playback functionality to C++/Qt5 programs."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-alsa2-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "71178ac48131961d0fe58dee5958afee7e55a818b9ab406a0b19b7564656c3965436346c7001a3ff57796876a94ead86705860139342e1f2c987b9b62050d302"

RPROVIDES:${PN} += "libdrumstick-alsa.so.2()(64bit) libdrumstick-alsa2 libdrumstick-alsa2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

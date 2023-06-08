SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes classes providing file input and output in formats \
commonly used by MIDI programs. Currently, SMF (standard MIDI file) \
read/write and WRK (Cakewalk) file read are supported. This library does not \
depend on ALSA."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-file2-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "d1d2461ea58fca7da57d40ae2d83ba9886b318acd8f9c3a0af9b5fee117e8542fdb1b46d3517d168e2ff9443ef86da5713465a850c49b9326ae4dd8591c577f3"

RPROVIDES:${PN} += "libdrumstick-file.so.2()(64bit) libdrumstick-file2 libdrumstick-file2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

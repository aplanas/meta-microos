SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This package contains input/output plugins for libdrumstick-rt2."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-rt2-plugins-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "4c35d3c0b5103210195566dc13e501889c2d788d6c49ca64c52b3bd03c349f5583d901cdfa5cde4730a30f191b6b38c05b11f3b928959d47a5540e41b9d86854"

RPROVIDES:${PN} += "libdrumstick-rt-alsa-in.so()(64bit) \
libdrumstick-rt-alsa-out.so()(64bit) \
libdrumstick-rt-eassynth.so()(64bit) \
libdrumstick-rt-fluidsynth.so()(64bit) \
libdrumstick-rt-net-in.so()(64bit) \
libdrumstick-rt-net-out.so()(64bit) \
libdrumstick-rt-oss-in.so()(64bit) \
libdrumstick-rt-oss-out.so()(64bit) \
libdrumstick-rt2-plugins \
libdrumstick-rt2-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrumstick-alsa.so.2()(64bit) \
libdrumstick-rt.so.2()(64bit) \
libfluidsynth.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsonivox.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

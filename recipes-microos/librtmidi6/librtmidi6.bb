SUMMARY = "C++ library for realtime MIDI input/ouput"
DESCRIPTION = "RtMidi is a set of C++ classes (RtMidiIn, RtMidiOut and API-specific \
classes) that provides a common API (Application Programming Interface) for \
realtime MIDI input/output across ALSA & JACK. \
 \
This package provides the shared library."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "librtmidi6-5.0.0-1.7.aarch64.rpm"
RPM_HASH = "9702e76f0998a7ab2cf62d26bb9cdaa47b551b31a6df90b554021192feeea8c70fa4fd3cb382fd020b280d9421ca0313ce64ca8d34652e04918a3c9351a1a2dd"

RPROVIDES:${PN} += "librtmidi.so.6()(64bit) librtmidi6 librtmidi6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjack.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

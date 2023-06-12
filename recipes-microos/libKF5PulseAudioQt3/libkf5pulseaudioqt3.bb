SUMMARY = "Qt bindings for PulseAudio"
DESCRIPTION = "Pulseaudio-Qt is a library providing Qt bindings to PulseAudio."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3"

RPM_NAME = "libKF5PulseAudioQt3-1.3-1.10.aarch64.rpm"
RPM_HASH = "0119f82735372f21f6a21e786fcf78f1da2ddcf376bfe1280696ee3bd69903d8d52d76abdd428260ae94bd7ab7bc2c2a8a0c5294ff4c3f677cb3b64a2a071f4b"

RPROVIDES:${PN} += "libKF5PulseAudioQt.so.3()(64bit) \
libKF5PulseAudioQt3 \
libKF5PulseAudioQt3(aarch-64) \
pulseaudio-qt"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm

SUMMARY = "Qt5 Speech Module - Speech Dispatcher support"
DESCRIPTION = "This plugin adds support for using speech-dispatcher for speech synthesis \
with the Qt5 Speech module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtspeech-plugin-speechd-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "43731335cbdbd3033175323e0bc5c5ecbde3fb9b553fb3eadea397623bb2610f5e371f5c4e7c7fec28a878252e077d8bb3ee4e34b1f986f1fdd0fd6b8dd79ba0"

RPROVIDES:${PN} += "libqt5-qtspeech-plugin-speechd libqt5-qtspeech-plugin-speechd(aarch-64) libqtexttospeech_speechd.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5TextToSpeech.so.5()(64bit) libQt5TextToSpeech.so.5(Qt_5)(64bit) libQt5TextToSpeech5 libc.so.6(GLIBC_2.17)(64bit) libspeechd.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

SUMMARY = "Qt5 Speech examples"
DESCRIPTION = "Examples for the libqt5-qtspeech module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtspeech-examples-5.15.9+kde1-1.2.aarch64.rpm"
RPM_HASH = "14791e7adc6b9a0ad0cf680ae90e334c2a8d714d40021ccaaa03c4bc7d4aa6fe3a1fede00662b550f19dc7a0be9369c411cca43e679cec6511294d88899bb4aa"

RPROVIDES:${PN} += "libqt5-qtspeech-examples \
libqt5-qtspeech-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5TextToSpeech.so.5()(64bit) \
libQt5TextToSpeech.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

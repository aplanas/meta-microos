SUMMARY = "Examples for the qt6-speech modules"
DESCRIPTION = "Examples for the qt6-speech modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-speech-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "3db71c2001803bc6a5bb9d5ce0e57dda4db32c382e3a2746ee23b26b7266cc46a703fbf010cf47f99693bb477edbd60f5a3528d06ebe2599959bc8a031bf8c85"

RPROVIDES:${PN} += "qt6-speech-examples qt6-speech-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6TextToSpeech.so.6()(64bit) libQt6TextToSpeech.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

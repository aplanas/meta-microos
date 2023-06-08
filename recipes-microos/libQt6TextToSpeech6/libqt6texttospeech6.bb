SUMMARY = "Qt 6 TextToSpeech library"
DESCRIPTION = "The QTextToSpeech class provides a convenient access to text-to-speech engines."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6TextToSpeech6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "2aecbf613ae06f9e595b6aa959b2bdc69a7d492a5b3097c95392f8d9340f1da03636223992ddb54998d129d4fceae47611aa4958c66df1f4c473e6826a5efd0b"

RPROVIDES:${PN} += "libQt6TextToSpeech.so.6()(64bit) libQt6TextToSpeech.so.6(Qt_6)(64bit) libQt6TextToSpeech.so.6(Qt_6.0)(64bit) libQt6TextToSpeech.so.6(Qt_6.1)(64bit) libQt6TextToSpeech.so.6(Qt_6.2)(64bit) libQt6TextToSpeech.so.6(Qt_6.3)(64bit) libQt6TextToSpeech.so.6(Qt_6.4)(64bit) libQt6TextToSpeech.so.6(Qt_6.5)(64bit) libQt6TextToSpeech.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6TextToSpeech6 libQt6TextToSpeech6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt6-texttospeech"

inherit rpm

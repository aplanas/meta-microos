SUMMARY = "Qt 6 TextToSpeech plugin"
DESCRIPTION = "Qt 6 TextToSpeech plugin."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-texttospeech-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "576033eb979e82c879ede6f110f5e5d9344da6f07bed8bdc18b5892409c5c1872f8f329d097a7b7b9b72a4c74341a88dc73c14da8b767ee7becf89d40301ea50"

RPROVIDES:${PN} += "libqtexttospeech_mock.so()(64bit) libqtexttospeech_mock.so(Qt_6)(64bit) libqtexttospeech_mock.so(Qt_6.0)(64bit) libqtexttospeech_mock.so(Qt_6.1)(64bit) libqtexttospeech_mock.so(Qt_6.2)(64bit) libqtexttospeech_mock.so(Qt_6.3)(64bit) libqtexttospeech_mock.so(Qt_6.4)(64bit) libqtexttospeech_mock.so(Qt_6.5)(64bit) libqtexttospeech_mock.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtexttospeech_speechd.so()(64bit) libqtexttospeech_speechd.so(Qt_6)(64bit) libqtexttospeech_speechd.so(Qt_6.0)(64bit) libqtexttospeech_speechd.so(Qt_6.1)(64bit) libqtexttospeech_speechd.so(Qt_6.2)(64bit) libqtexttospeech_speechd.so(Qt_6.3)(64bit) libqtexttospeech_speechd.so(Qt_6.4)(64bit) libqtexttospeech_speechd.so(Qt_6.5)(64bit) libqtexttospeech_speechd.so(Qt_6.5.0_PRIVATE_API)(64bit) libtexttospeechqmlplugin.so()(64bit) libtexttospeechqmlplugin.so(Qt_6)(64bit) libtexttospeechqmlplugin.so(Qt_6.0)(64bit) libtexttospeechqmlplugin.so(Qt_6.1)(64bit) libtexttospeechqmlplugin.so(Qt_6.2)(64bit) libtexttospeechqmlplugin.so(Qt_6.3)(64bit) libtexttospeechqmlplugin.so(Qt_6.4)(64bit) libtexttospeechqmlplugin.so(Qt_6.5)(64bit) libtexttospeechqmlplugin.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-texttospeech qt6-texttospeech(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6TextToSpeech.so.6()(64bit) libQt6TextToSpeech.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libspeechd.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm

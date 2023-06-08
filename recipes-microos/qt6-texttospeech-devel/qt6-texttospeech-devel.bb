SUMMARY = "Qt 6 TextToSpeech library - Development files"
DESCRIPTION = "Development files for the Qt 6 TextToSpeech library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-texttospeech-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "058437457c9aceebc7bc490b0c7ceb8dcae8ca54ede7449bd03a4ae275aaca9b82097609de4756219703c94e8584927b9fa88bba4c88bb0407b33fe56592a74a"

RPROVIDES:${PN} += "cmake(Qt6QTextToSpeechMockPlugin) cmake(Qt6QTextToSpeechSpeechdPlugin) cmake(Qt6TextToSpeech) pkgconfig(Qt6TextToSpeech) qt6-texttospeech-devel qt6-texttospeech-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6TextToSpeech6 pkgconfig(Qt6Core)"

inherit rpm

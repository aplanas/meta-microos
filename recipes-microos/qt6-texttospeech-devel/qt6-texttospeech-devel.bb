SUMMARY = "Qt 6 TextToSpeech library - Development files"
DESCRIPTION = "Development files for the Qt 6 TextToSpeech library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-texttospeech-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f8e9e3ed5f058bc40e26e3c8931168ba9245cf08df261e97430ec3f60147222f199bd9a34cf10c8cb088adeccdb9b6a3b8e8b1bc1ed31c9f50e94781282edd0b"

RPROVIDES:${PN} += "cmake(Qt6QTextToSpeechMockPlugin) cmake(Qt6QTextToSpeechSpeechdPlugin) cmake(Qt6TextToSpeech) pkgconfig(Qt6TextToSpeech) qt6-texttospeech-devel qt6-texttospeech-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6TextToSpeech6 pkgconfig(Qt6Core)"

inherit rpm

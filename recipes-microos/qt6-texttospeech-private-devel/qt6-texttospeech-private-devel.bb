SUMMARY = "Non-ABI stable API for the Qt 6 TextToSpeech library"
DESCRIPTION = "This package provides private headers of libQt6TextToSpeech that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-texttospeech-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7838a917eee30100ed647b22e27e9b15d08a008555fb900ceaffa457e9d3c471db4128e82443b169af5ed52d1ad0b2cded3eba031894f199f05fdfd28ec57f97"

RPROVIDES:${PN} += "qt6-texttospeech-private-devel qt6-texttospeech-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6TextToSpeech) qt6-core-private-devel"

inherit rpm

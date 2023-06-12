SUMMARY = "Non-ABI stable API for the Qt 6 TextToSpeech library"
DESCRIPTION = "This package provides private headers of libQt6TextToSpeech that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-texttospeech-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "32c302ddd83869b78c40d439961ada90d1f87a8098ca0334943496f7ec6379f711b0ff66f78ebbe3d4ab5ad10047ac735c69105deafdaa28bc753742e099eca3"

RPROVIDES:${PN} += "qt6-texttospeech-private-devel \
qt6-texttospeech-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6TextToSpeech) \
qt6-core-private-devel"

inherit rpm

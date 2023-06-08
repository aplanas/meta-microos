SUMMARY = "Development files for the Qt 6 HunspellInputMethod library"
DESCRIPTION = "Development files for the Qt 6 HunspellInputMethod library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-hunspellinputmethod-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "540c597d110ef8b1a3448c8b5bdad087063d07547694803116c2619eaacebc360d87256a602694be1a4044a2e329caca1af9cef86b70af9b61877c2d4c5f3f87"

RPROVIDES:${PN} += "cmake(Qt6HunspellInputMethod) qt6-hunspellinputmethod-devel qt6-hunspellinputmethod-private-devel qt6-hunspellinputmethod-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Gui) libQt6HunspellInputMethod6 qt6-virtualkeyboard-private-devel"

inherit rpm

SUMMARY = "Development files for the Qt 6 HunspellInputMethod library"
DESCRIPTION = "Development files for the Qt 6 HunspellInputMethod library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-hunspellinputmethod-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a4db4be70fbfbfd22b81e1ad3fc05f85c9c05c169bcb94958637460a98da5ac925d50ebe436ab21bae5f56b069ac115680c8ece099574994ff18dc57fffea720"

RPROVIDES:${PN} += "cmake(Qt6HunspellInputMethod) qt6-hunspellinputmethod-devel qt6-hunspellinputmethod-private-devel qt6-hunspellinputmethod-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Gui) libQt6HunspellInputMethod6 qt6-virtualkeyboard-private-devel"

inherit rpm

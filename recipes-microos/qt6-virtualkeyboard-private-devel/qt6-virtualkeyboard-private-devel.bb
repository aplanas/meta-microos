SUMMARY = "Non-ABI stable API for the Qt 6 VirtualKeyboard library"
DESCRIPTION = "This package provides private headers of libQt6VirtualKeyboard that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-virtualkeyboard-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0e0678b69675e2b11a18163e851fa16a6443aa0a76d1075dd0574d63488daa6a481108b32a3a0aabedb50789da665b75e0fb3c154ac1e00b572df23076ca06b6"

RPROVIDES:${PN} += "qt6-virtualkeyboard-private-devel qt6-virtualkeyboard-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6VirtualKeyboard) qt6-core-private-devel qt6-gui-private-devel"

inherit rpm

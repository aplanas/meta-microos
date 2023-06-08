SUMMARY = "Qt 6 QuickEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickeffects-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "7aa2c5dc654d631ad89019cc0316f632e8d40e2f9e9506e84a7492a017c3523a7c0fc8b59d33d896f0cd447d7a85cd6223947cc814cba7c6bd92ff1eff689cb8"

RPROVIDES:${PN} += "cmake(Qt6QuickEffectsPrivate) qt6-quickeffects-private-devel qt6-quickeffects-private-devel(aarch-64)"
RDEPENDS:${PN} += "libQt6QuickEffects6 qt6-gui-private-devel qt6-qml-private-devel qt6-quick-private-devel"

inherit rpm

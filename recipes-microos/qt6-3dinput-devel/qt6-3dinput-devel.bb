SUMMARY = "Development files for the Qt 6 3DInput library"
DESCRIPTION = "Development files for the Qt 6 3DInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dinput-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b295541697a65ed268207433f900bc403850209a011cc453cceeef2e2220392cc26d4fee43666eaf6655178809c5d82e89cf13a3df04c0bc79aa0993e53c200f"

RPROVIDES:${PN} += "cmake(Qt63DInput) \
pkgconfig(Qt63DInput) \
qt6-3dinput-devel \
qt6-3dinput-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt63DCore) \
libQt63DInput6 \
pkgconfig(Qt63DCore) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui)"

inherit rpm

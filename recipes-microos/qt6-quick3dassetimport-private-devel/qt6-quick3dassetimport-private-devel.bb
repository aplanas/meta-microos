SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetImport library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetImport that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dassetimport-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6e6480f3d1fc85bf0f320f50dc9ab317ce92ce4b5c9c64a8667054502bf389d35e390b4791844d8caf2f6212c33246b3a4e9049abd014c7991dd7bf9b3279b5d"

RPROVIDES:${PN} += "qt6-quick3dassetimport-private-devel qt6-quick3dassetimport-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DAssetImport) qt6-core-private-devel qt6-quick3dutils-private-devel"

inherit rpm

SUMMARY = "Qt 6 LabsWavefrontMesh library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsWavefrontMesh library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labswavefrontmesh-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "779a89a31204ffc0e66f441204a9a49a56be6158320971f296fdcb1e68304f8f7ab62f343c9f8047aa270af9e52394344c9b1021f6c176695b8fa509c27cb535"

RPROVIDES:${PN} += "cmake(Qt6LabsWavefrontMesh) pkgconfig(Qt6LabsWavefrontMesh) qt6-labswavefrontmesh-devel qt6-labswavefrontmesh-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6LabsWavefrontMesh6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) qt6-gui-private-devel qt6-quick-private-devel"

inherit rpm

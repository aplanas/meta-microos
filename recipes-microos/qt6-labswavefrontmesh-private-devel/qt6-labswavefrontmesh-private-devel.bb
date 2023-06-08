SUMMARY = "Non-ABI stable API for the Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "This package provides private headers of libQt6LabsWavefrontMesh that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labswavefrontmesh-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "57a4b02ad0439eea88126f4a7757cc058030d522afe095f8f7e1ac958c55342d9a7070a70302b1c793ba1b84ba743c2c69c1475468582c483a1f37680fbf3c3a"

RPROVIDES:${PN} += "qt6-labswavefrontmesh-private-devel qt6-labswavefrontmesh-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6LabsWavefrontMesh)"

inherit rpm

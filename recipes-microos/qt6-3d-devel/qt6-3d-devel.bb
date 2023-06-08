SUMMARY = "Qt 6 3D development meta package"
DESCRIPTION = "This meta-package requires all the qt6-3d development packages."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3d-devel-6.5.0-1.1.noarch.rpm"
RPM_HASH = "e6406e905dfa97ea6066cda09255d2c0fc96193d021bc93910cd658b0b0d46505dbe0a68848c43d42a05c346e2dcee262c5fb3f72b5bfb728a02567887008fe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-3d-devel"
RDEPENDS:${PN} += "cmake(Qt63DAnimation) cmake(Qt63DCore) cmake(Qt63DExtras) cmake(Qt63DInput) cmake(Qt63DLogic) cmake(Qt63DQuick) cmake(Qt63DQuickAnimation) cmake(Qt63DQuickExtras) cmake(Qt63DQuickInput) cmake(Qt63DQuickRender) cmake(Qt63DQuickScene2D) cmake(Qt63DRender)"

inherit rpm

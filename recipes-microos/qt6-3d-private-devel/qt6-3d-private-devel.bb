SUMMARY = "Qt 6 3D unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-3d development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3d-private-devel-6.5.0-1.1.noarch.rpm"
RPM_HASH = "360aa41763178464009b736357559d38560f14ed62c2ae91b586d75f2d4c1933ca3dfe8c7e2646f1f8d531340050384aaf4f749cb19dc5ef5f4bc4306e1a6059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-3d-private-devel"
RDEPENDS:${PN} += "qt6-3d-devel qt6-3danimation-private-devel qt6-3dcore-private-devel qt6-3dextras-private-devel qt6-3dinput-private-devel qt6-3dlogic-private-devel qt6-3dquick-private-devel qt6-3dquickanimation-private-devel qt6-3dquickextras-private-devel qt6-3dquickinput-private-devel qt6-3dquickrender-private-devel qt6-3dquickscene2d-private-devel qt6-3drender-private-devel"

inherit rpm

SUMMARY = "Qt 6 3D unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-3d development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3d-private-devel-6.5.1-1.1.noarch.rpm"
RPM_HASH = "fa1fcdabb4817fb01dba1489aaea1d3a8f677cd36d8969ce43c3fbc77e23f1a9412a722a2629b44da38199e3cfd2b89157c673a9840d093172f3d8df23520033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-3d-private-devel"
RDEPENDS:${PN} += "qt6-3d-devel \
qt6-3danimation-private-devel \
qt6-3dcore-private-devel \
qt6-3dextras-private-devel \
qt6-3dinput-private-devel \
qt6-3dlogic-private-devel \
qt6-3dquick-private-devel \
qt6-3dquickanimation-private-devel \
qt6-3dquickextras-private-devel \
qt6-3dquickinput-private-devel \
qt6-3dquickrender-private-devel \
qt6-3dquickscene2d-private-devel \
qt6-3drender-private-devel"

inherit rpm

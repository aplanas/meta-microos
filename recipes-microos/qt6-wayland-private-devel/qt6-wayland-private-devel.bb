SUMMARY = "Qt6 wayland unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-wayland-private-devel-6.5.0-1.1.noarch.rpm"
RPM_HASH = "aac409d3deb5e45de12487eca8fb2df20544b39f83120cab74547c3c7c25528cadd3f27f015bcd0ef56e5976dab6f0dbd161629d4ae61e37d48a0a93374f0b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-wayland-private-devel"
RDEPENDS:${PN} += "cmake(Qt6WaylandEglClientHwIntegrationPrivate) cmake(Qt6WaylandEglCompositorHwIntegrationPrivate) cmake(Qt6WlShellIntegrationPrivate) qt6-waylandclient-private-devel qt6-waylandcompositor-private-devel"

inherit rpm

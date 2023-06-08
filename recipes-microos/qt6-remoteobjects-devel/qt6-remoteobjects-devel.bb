SUMMARY = "Qt 6 RemoteObjects library - Development files"
DESCRIPTION = "Development files for the Qt 6 RemoteObjects library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-remoteobjects-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0862da74611069c1ef8858d13a90d4754e16c82eaebfc994d57a3265a790e326e45aca8e1973e08ca5e56f696fb86226e57e2abec8522c6a464501b9e8cd854a"

RPROVIDES:${PN} += "cmake(Qt6RemoteObjects) cmake(Qt6RemoteObjectsTools) pkgconfig(Qt6RemoteObjects) qt6-remoteobjects-devel qt6-remoteobjects-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Network) libQt6RemoteObjects6 pkgconfig(Qt6Core) pkgconfig(Qt6Network) qt6-remoteobjects-tools"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 RemoteObjectsQml library"
DESCRIPTION = "This package provides private headers of libQt6RemoteObjectsQml that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-remoteobjectsqml-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d0b64616aa9d7b41e11b757f2e20aa873cfe3c9a903809fda1b871af717bee9bbd3d2961e3da30a5a84fc8c75dbe8f2b56961481304bebac3fbc08755df5d686"

RPROVIDES:${PN} += "qt6-remoteobjectsqml-private-devel qt6-remoteobjectsqml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6RemoteObjectsQml)"

inherit rpm

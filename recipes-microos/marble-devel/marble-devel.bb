SUMMARY = "Generic map viewer: Build Environment"
DESCRIPTION = "Development headers and libraries for Marble."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "marble-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "fae99a34c26398bf6f5a24c3de472ae23919e70e6d7b0ac5df8cf755dcbca37cb36e1d90276eb36f5ad9f9cc47bd3e79027503e5df394a4bd826ce22dc44eb47"

RPROVIDES:${PN} += "cmake(Astro) cmake(Marble) marble-devel marble-devel(aarch-64) marble5-devel"
RDEPENDS:${PN} += "cmake(Qt5WebEngineWidgets) cmake(Qt5Widgets) cmake(Qt5Xml) libastro1 libmarblewidget-qt5-28"

inherit rpm

SUMMARY = "Development files for the Qt 6 DesignerComponents library"
DESCRIPTION = "Development files for the Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-designercomponents-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b6c53dbf89cade01f1924ffbfe96b3a1f0b7728e4d698020c88ee61d978e0341c440460c9115aa29a4fd02a927f4f4808c97778dc3501921b27b6d71978048b3"

RPROVIDES:${PN} += "cmake(Qt6DesignerComponentsPrivate) qt6-designercomponents-private-devel qt6-designercomponents-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Core) cmake(Qt6Xml) libQt6DesignerComponents6 qt6-designer-private-devel qt6-gui-private-devel qt6-widgets-private-devel"

inherit rpm

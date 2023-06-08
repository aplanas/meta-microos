SUMMARY = "Qt 6 Tools libraries - Development files"
DESCRIPTION = "Development files for the Qt6 tools libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-tools-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "5b1a601d5e51676d78ab3cb657d05dfb8af4ecf29537ad850380f0665ae8f37cdd3dc18ad9744776fed754e7499f4f483d2e8e96afad76fdb2f000129cd4bd80"

RPROVIDES:${PN} += "cmake(Qt6Tools) cmake(Qt6ToolsTools) qt6-tools-devel qt6-tools-devel(aarch-64)"
RDEPENDS:${PN} += "qt6-tools qt6-tools-helpgenerators qt6-tools-qdoc"

inherit rpm

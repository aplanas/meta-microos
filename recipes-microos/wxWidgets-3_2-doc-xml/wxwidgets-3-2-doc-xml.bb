SUMMARY = "wxWidgets interface description"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains the interface description in XML format, \
useful for generating bindings."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxWidgets-3_2-doc-xml-3.2.2.1-2.1.noarch.rpm"
RPM_HASH = "94679bb791367ebec6330efc3b19f02424abdff6056a35a6890bc792d3e8e2c3e80333c8405f7329d4f2e7594ecbcbef57a613b8e4eda7d82439baf95d38b4c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wxWidgets-3_2-doc-xml"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "wxWidgets API documentation"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains the API documentation in HTML format."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxWidgets-3_2-doc-html-3.2.2.1-2.1.noarch.rpm"
RPM_HASH = "59934bba435ad9c4ae5ca1b6710893c61537637d18c9e7ba9d1eed1d16991539896b716f3a8fe83694393ecd8067368a2004401d1d3c6a308363b52186b34a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wxWidgets-3_2-doc-html"
RDEPENDS:${PN} += ""

inherit rpm

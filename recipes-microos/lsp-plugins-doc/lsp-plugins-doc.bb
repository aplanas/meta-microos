SUMMARY = "Linux Studio Plugins Documentation"
DESCRIPTION = "Documentation for Linux Studio Plugins Project"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lsp-plugins-doc-1.2.7-1.1.noarch.rpm"
RPM_HASH = "a6bf2ce968ca01bf06f5f90ff87b4d36edea100a21d43dd72af557fc627f939ae5cf71cbe555784e1d7bb0122876e04f89e238c3bf449b11a64f70988231858e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsp-plugins-doc"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-luaindex"
DESCRIPTION = "This package includes the documentation for texlive-luaindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1bsvn25882"

RPM_NAME = "texlive-luaindex-doc-2023.201.0.0.1bsvn25882-52.1.noarch.rpm"
RPM_HASH = "2a23c6a324c13e88c83e562cf0227cad6b6ddd84db1490fab64f197daec2c03de507364fc35dd017a47e8670837059dd1244d4640fe355c2ae7d49aaeaaf59f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaindex-doc"
RDEPENDS:${PN} += ""

inherit rpm

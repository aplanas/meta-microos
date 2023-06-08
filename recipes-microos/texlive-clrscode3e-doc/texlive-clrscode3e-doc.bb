SUMMARY = "Documentation for texlive-clrscode3e"
DESCRIPTION = "This package includes the documentation for texlive-clrscode3e"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn51137"

RPM_NAME = "texlive-clrscode3e-doc-2023.201.svn51137-53.1.noarch.rpm"
RPM_HASH = "a092a8148cb1a9a07daec4e232fe805810362656d86cd32bdbf180a21286a77fecf94163b034044ede2f5e36d25745f5fc6ffa90b9c7c164667f8477ecf4dd51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrscode3e-doc"
RDEPENDS:${PN} += ""

inherit rpm

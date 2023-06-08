SUMMARY = "Documentation for texlive-schemata"
DESCRIPTION = "This package includes the documentation for texlive-schemata"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn58020"

RPM_NAME = "texlive-schemata-doc-2023.201.1.4svn58020-53.1.noarch.rpm"
RPM_HASH = "c1c04b003900b2d463887a22823a4e78c339a18f7d0e37f3b28a48f56a6cf5ce2b08e39fa26acee94632342a4e5caadca049a51005ae1a47acacaafbcd7db419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schemata-doc"
RDEPENDS:${PN} += ""

inherit rpm

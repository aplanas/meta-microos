SUMMARY = "Documentation for texlive-hfbright"
DESCRIPTION = "This package includes the documentation for texlive-hfbright"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-hfbright-doc-2023.201.svn29349-53.1.noarch.rpm"
RPM_HASH = "3d964d854e3b433b66b5d2bba56ab321cd45d3f48ab85c9f5182a9abfa38568f1386eb17f5f8feec5aca73193a77f2f9379bc128d877fd42f82ede5e2002ff80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfbright-doc"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-tabbing"
DESCRIPTION = "This package includes the documentation for texlive-tabbing"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59715"

RPM_NAME = "texlive-tabbing-doc-2023.201.svn59715-57.1.noarch.rpm"
RPM_HASH = "6e0c2d66770701b7f43a5e3658a709069511f490a3ccf6ee118f3ee3168861abc64d33644e4ba1cfa603666baa768d9b13225b84d0a532800373dea997b930e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tabbing-doc:en) texlive-tabbing-doc"
RDEPENDS:${PN} += ""

inherit rpm

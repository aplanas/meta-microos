SUMMARY = "Documentation for texlive-bxorigcapt"
DESCRIPTION = "This package includes the documentation for texlive-bxorigcapt"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64072"

RPM_NAME = "texlive-bxorigcapt-doc-2023.201.1.0svn64072-52.1.noarch.rpm"
RPM_HASH = "64ad433844e1de5c67dae8196365392c5d4865e050c643e2ac06cfaae9a8f1692203064f561c50f48ba0bfe90cbda9076bf8572408da3832ae772cfe8c45978e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxorigcapt-doc"
RDEPENDS:${PN} += ""

inherit rpm

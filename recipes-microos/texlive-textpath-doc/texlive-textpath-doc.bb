SUMMARY = "Documentation for texlive-textpath"
DESCRIPTION = "This package includes the documentation for texlive-textpath"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn15878"

RPM_NAME = "texlive-textpath-doc-2023.201.1.6svn15878-54.1.noarch.rpm"
RPM_HASH = "f791fceca1eabaed65c4efff702c69a961daf249929c85d20f0f1129aac159835a50dc2bd941a8d0d4c64258ef412c3d484fe106fb3767d91e12491574e97069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textpath-doc"
RDEPENDS:${PN} += ""

inherit rpm

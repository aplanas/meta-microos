SUMMARY = "Documentation for texlive-rotpages"
DESCRIPTION = "This package includes the documentation for texlive-rotpages"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn18740"

RPM_NAME = "texlive-rotpages-doc-2023.201.3.0svn18740-53.1.noarch.rpm"
RPM_HASH = "56d61bc1be6b9403ba67be40258f4c0ab6e9100a1f215e342d8a602c1e4e251fb805e5d7df214f4276e3f3c63cabc031ce3e4a95463bfb37568f2d1cfb237fae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rotpages-doc"
RDEPENDS:${PN} += ""

inherit rpm

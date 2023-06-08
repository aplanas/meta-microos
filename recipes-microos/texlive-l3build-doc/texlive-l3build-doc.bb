SUMMARY = "Documentation for texlive-l3build"
DESCRIPTION = "This package includes the documentation for texlive-l3build"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66471"

RPM_NAME = "texlive-l3build-doc-2023.201.svn66471-55.1.noarch.rpm"
RPM_HASH = "660d7cda20c30f57e74e0798ee685eb0f443b3ab1becac249c331c015957b3128ac3ddae914ac90e372482649eb5fb51ed72be849f191a1813332951b9f0bcf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(l3build.1) texlive-l3build-doc"
RDEPENDS:${PN} += ""

inherit rpm

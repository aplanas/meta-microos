SUMMARY = "Documentation for texlive-almfixed"
DESCRIPTION = "This package includes the documentation for texlive-almfixed"
LICENSE = "LPPL-1.3c"

PV = "2023.201.0.0.92svn35065"

RPM_NAME = "texlive-almfixed-doc-2023.201.0.0.92svn35065-54.1.noarch.rpm"
RPM_HASH = "a629b5377bb80d5736e4c961b06d1b89a8215cf314b717f7771121f47d12f5606795fdb98ec41a0f341d50fd4d69ded4d7c178da92264841f49e5e4f5803f4d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-almfixed-doc"
RDEPENDS:${PN} += ""

inherit rpm

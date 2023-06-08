SUMMARY = "Documentation for texlive-pst-perspective"
DESCRIPTION = "This package includes the documentation for texlive-pst-perspective"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn39585"

RPM_NAME = "texlive-pst-perspective-doc-2023.201.1.05svn39585-53.1.noarch.rpm"
RPM_HASH = "5a7aca7b1daee83a4cd30d1232594ea0510401fd269c69879233c753c74630c652017c272f775cf05d09fd6cb44af2606ddf4c2ccd69c793e58da711144f3cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-perspective-doc:de;en) texlive-pst-perspective-doc"
RDEPENDS:${PN} += ""

inherit rpm

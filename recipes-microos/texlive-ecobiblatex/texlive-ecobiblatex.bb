SUMMARY = "Global Ecology and Biogeography BibLaTeX styles for the Biber backend"
DESCRIPTION = "This bundle provides a set of styles for creating \
bibliographies using BibLaTeX in the style of the Global \
Ecology and Biogeography journal. It comprises styles based on \
the conventions of John Wiley & Sons Ltd and Global Ecology and \
Biogeography Conventions (c)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39233"

RPM_NAME = "texlive-ecobiblatex-2023.201.1.0svn39233-53.1.noarch.rpm"
RPM_HASH = "a2e4e6c00087718143c3a7f778fe5ff571ffba088451fa40ea4b96c4b4ea382ee90f98352656e61be09cd9b815284e9d725f33c44601f58b88ba4e80d1b3ba95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ecobiblatex.bbx) tex(ecobiblatex.cbx) texlive-ecobiblatex"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(authoryear-comp.bbx) tex(authoryear-comp.cbx) tex(standard.bbx) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

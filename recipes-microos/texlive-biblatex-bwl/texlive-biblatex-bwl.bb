SUMMARY = "BibLaTeX citations for FU Berlin"
DESCRIPTION = "The bundle provides a set of BibLaTeX implementations of \
bibliography and citation styles for the Business \
Administration Department of the Free University of Berlin."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn26556"

RPM_NAME = "texlive-biblatex-bwl-2023.201.0.0.02svn26556-53.1.noarch.rpm"
RPM_HASH = "5f377c25b3335415b5c4c0202b9967e57fb5b313ee6e99d49948517fd8e68da48dcb1560c9997526bec6706cc45c647e40692c0c0ba2865b2301d8ec2ed4f5bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bwl-FU.bbx) tex(bwl-FU.cbx) texlive-biblatex-bwl"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(authoryear.bbx) tex(authoryear.cbx) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

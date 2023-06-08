SUMMARY = "Figures which fill up a whole page"
DESCRIPTION = "This package defines a figure environment which provides the \
figure content on its own page, with the corresponding caption \
reading for example 'Figure 3 (on next page): <caption>'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41857"

RPM_NAME = "texlive-phffullpagefigure-2023.201.1.0svn41857-51.1.noarch.rpm"
RPM_HASH = "f172d59750b8c684eb5f12c1aa4d70880eaf3102e7e4ed825a8c489b9f20ef4d9b8ffb22d28c51c3b2a5dbbf56b9853afe65635ce7641b87027c5bec73e5578d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phffullpagefigure.sty) texlive-phffullpagefigure"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(afterpage.sty) tex(etoolbox.sty) tex(ifoddpage.sty) tex(pdfpages.sty) tex(placeins.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

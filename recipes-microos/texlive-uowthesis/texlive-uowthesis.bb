SUMMARY = "Document class for dissertations at the University of Wollongong"
DESCRIPTION = "A document class for higher degree research theses in \
compliance with the specifications of University of Wollongong \
(UoW) theses in the 'Guidelines for Preparation and Submission \
of Higher Degree Research Theses' (March 2006), by the Research \
Student Centre, Research & Innovation Division, UoW."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn19700"

RPM_NAME = "texlive-uowthesis-2023.201.1.0asvn19700-53.1.noarch.rpm"
RPM_HASH = "f8035e1a818bcd72a3335c7a66f849e97e219a0977d2b7bb298b26863ca15b60b581fc15473e8cb586b8a68fd2f0fe1cd67b3d47a4dc824aca1d18e54e832750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(UoWthesis.cls) texlive-uowthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fancyhdr.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(nextpage.sty) tex(report.cls) tex(setspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

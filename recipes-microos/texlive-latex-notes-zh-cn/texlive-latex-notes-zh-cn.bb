SUMMARY = "Chinese Introduction to TeX and LaTeX"
DESCRIPTION = "The document is an introduction to TeX/LaTeX, in Chinese. It \
covers basic text typesetting, mathematics, graphics, tables, \
Chinese language & fonts, and some miscellaneous features \
(hyperlinks, long documents, bibliographies, indexes and page \
layout)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn15878"

RPM_NAME = "texlive-latex-notes-zh-cn-2023.201.1.20svn15878-55.1.noarch.rpm"
RPM_HASH = "3c63d71a80c71a08109e72287c7bca40dfcede5ba4ff4a6c36d98c78e69b7d8001441ad76c9de144ae29868695c4c757844278699707f86eb384027986fe3305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-notes-zh-cn"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

SUMMARY = "Support for formatting SPIE Proceedings manuscripts"
DESCRIPTION = "A class and a BibTeX style are provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.25svn15878"

RPM_NAME = "texlive-spie-2023.201.3.25svn15878-57.1.noarch.rpm"
RPM_HASH = "7955671dda24826ffde87194fc5a0cfe8b597498ecbdb1fc0c21a1874e064c2cddd928ba133b084b692f78910ecf9580cd24d3b07a0b80427901f4024fad826b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spie.cls) texlive-spie"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(cite.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

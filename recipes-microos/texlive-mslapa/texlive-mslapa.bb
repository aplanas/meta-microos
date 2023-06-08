SUMMARY = "Michael Landy's APA citation style"
DESCRIPTION = "LaTeX and BibTeX style files for a respectably close \
approximation to APA (American Psychological Association) \
citation and reference style."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-mslapa-2023.201.svn54080-54.1.noarch.rpm"
RPM_HASH = "30b3def8f1ee9176eba54a806fcce893b7e9536d51289adf30f3d615cb16e0fdb5ece5f4243e080717c730cb24a8596aa3e76e8cdf07e4c77698df0bc5140b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mslapa.sty) texlive-mslapa"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

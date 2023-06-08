SUMMARY = "Expandable extraction of cleveref data"
DESCRIPTION = "This package extracts information from cross-referencing \
labels, especially those from cleveref, in an expandable \
manner."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn55879"

RPM_NAME = "texlive-crossreftools-2023.204.1.0svn55879-54.1.noarch.rpm"
RPM_HASH = "602bb5ec94da80c174159d2ef3cb6d813e7a24729608dca66765fdc8c4fcb93049b2e2b7553fb3d42f8ee51ceacf0f96946fe1f84aac88af4667346de9f69154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(crossreftools.sty) texlive-crossreftools"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

SUMMARY = "A ticking digital clock package for PDF output"
DESCRIPTION = "A ticking digital clock package to be used in Pdf-LaTeX \
documents, for example in presentations."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.5svn33043"

RPM_NAME = "texlive-tdclock-2023.201.2.5svn33043-54.1.noarch.rpm"
RPM_HASH = "739e0166662f5c76b2087e083d29e83411be6755b7a38fcf05710c81343dae086dca2d0ffda24ddb0c6a0c73990a83958891675e957afed0b1c365967fe97168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tdclock.sty) texlive-tdclock"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(hyperref.sty) tex(xcolor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

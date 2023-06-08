SUMMARY = "Draws electrocardiograms (ECG)"
DESCRIPTION = "This package provides the \\ECG{<code>} command which draws \
electrocardiograms (ECG). The <code> represents a series of \
abbreviations which allow to draw different types of wave."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn41617"

RPM_NAME = "texlive-ecgdraw-2023.201.0.0.1svn41617-53.1.noarch.rpm"
RPM_HASH = "c587e0aa297f6205dd181d824b6555743abca70a9471935c76eff51445811608fca6bd52fb5cb8939592de4900c5e7c3f0cff9db906281b88bb804220edce6b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ecgdraw.sty) texlive-ecgdraw"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(tikz.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

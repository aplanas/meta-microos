SUMMARY = "Fixed-point real computations to 8 decimals"
DESCRIPTION = "The package provides basic arithmetic operations to 8 decimal \
places for plain TeX or LaTeX. Results are exact when they fit \
within the digit limits. Along with the basic package is an \
optional extension that adds computation of sin, cos, log, \
sqrt, exp, powers and angles. These are also exact when \
theoretically possible and are otherwise accurate to at least 7 \
decimal places. In addition, the package provides a stack-based \
programing environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.96svn32559"

RPM_NAME = "texlive-minifp-2023.201.0.0.96svn32559-54.1.noarch.rpm"
RPM_HASH = "f783aa3556e953675177de9bea0222c60eb1c6d74bbd7897a0e89e1e5fb0d44118584282a720122fa9b23924221b3a2f32d645feb915357f02f85863ef9b1e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mfpextra.tex) tex(minifp.sty) texlive-minifp"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

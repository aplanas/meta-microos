SUMMARY = "MathGL scripts for LaTeX documents"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package allows to use MathGL scripts in LaTeX documents."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-tex-8.0.1-3.3.noarch.rpm"
RPM_HASH = "e8ae49d2b968c7e5dbb4c7196bd5e19732ab20d0e57903628a8be36ea32cce2e931bea3d878d620d645bd8993a76e5448ec7bf0a5bbfc300d59ea904438e8b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex \
tex(mgltex.sty)"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
mathgl-tools \
texlive"

inherit rpm

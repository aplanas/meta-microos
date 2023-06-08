SUMMARY = "General Dark Mode Support for LaTeX-Documents"
DESCRIPTION = "This package provides an API for template and package \
developers to create dynamic color schemes for light- and \
darkmodes. For those unaware: We refer to dark mode when a \
document has a dark background with a light font and to light \
mode if it has a dark font with a light background."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0.1svn64271"

RPM_NAME = "texlive-darkmode-2023.204.1.0.1svn64271-54.1.noarch.rpm"
RPM_HASH = "1b94cfee5b83cea83378e4ea1ffdd086418221d9f7a53376419be2ee7ce0b4ecce4a438cd4f1a8bf1f083defd27d0b8e6f2bf6ecc6a27d7f966d4c6110639d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(darkmode.sty) texlive-darkmode"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(l3keys2e.sty) tex(pagecolor.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

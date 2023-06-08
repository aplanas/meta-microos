SUMMARY = "Something like Koma-Script typearea"
DESCRIPTION = "The module provides a command that calculates the page layout \
as the LaTeX package typearea does."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-typearea-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "f2742379062df36a52f35be09776275f66cc90fce70f1b4a3d4067150e5041a534f331ff3cb7f5898fa7501cf2a18ec79b8d249d1b1b8e39763042ae57bb5e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-typearea.tex) texlive-context-typearea"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-context texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

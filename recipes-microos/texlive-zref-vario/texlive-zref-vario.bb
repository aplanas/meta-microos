SUMMARY = "Extended LaTeX page cross-references with varioref and zref-clever"
DESCRIPTION = "This package offers a compatibility layer for varioref to be \
used alongside zref-clever. It provides \\z... counterparts to \
varioref's main reference commands, each of which essentially \
does some (scoped) setup for varioref, then calls the original \
one."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.7svn65453"

RPM_NAME = "texlive-zref-vario-2023.201.0.0.1.7svn65453-52.1.noarch.rpm"
RPM_HASH = "671c71d2d68d956031784b4ff1d62868b6a54cfe8717455749c4bf283fad1b1fcf0510d9b88223c15565be8890948ef172bb5ac6493de6aaee52c56aef6b9c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(zref-vario.sty) texlive-zref-vario"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(varioref.sty) tex(zref-clever.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-tools texlive-zref-clever"

inherit rpm

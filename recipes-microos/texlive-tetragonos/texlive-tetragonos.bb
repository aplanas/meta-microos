SUMMARY = "Four-Corner codes of Chinese characters"
DESCRIPTION = "This is a XeLaTeX package for mapping Chinese characters to \
their codes in the Four-Corner Method."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn49732"

RPM_NAME = "texlive-tetragonos-2023.201.1svn49732-54.1.noarch.rpm"
RPM_HASH = "205b65a10b894e040f157dc82bb2171c91c70b4631c0770da5b1f84a223b05e0b370dee8d7a2f5f14c82973297d64a4fa17aa295e8b4bf06c96d11399d5a79a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tetragonos-database.def) tex(tetragonos.sty) texlive-tetragonos"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

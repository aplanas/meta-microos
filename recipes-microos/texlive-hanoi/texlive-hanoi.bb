SUMMARY = "Tower of Hanoi in TeX"
DESCRIPTION = "The Plain TeX program (typed in the shape of the towers of \
Hanoi) serves both as a game and as a TeX programming exercise. \
As a game it will solve the towers with (up to) 15 discs (with \
15 discs, 32767 moves are needed)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.20120101svn25019"

RPM_NAME = "texlive-hanoi-2023.201.20120101svn25019-53.1.noarch.rpm"
RPM_HASH = "e3b807da9c1f3509ffc301d0446e1d6bfca4821f128f793b97b6ca2ba9697cb0c8c7fd2e00d1a3fb1c8d3fcd3f9a8b975ebc506f16919add1ba5fb5c623a0938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hanoi.tex) texlive-hanoi"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

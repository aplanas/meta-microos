SUMMARY = "Draw (mathematical) rank 2 root systems"
DESCRIPTION = "This package concerns mathematical drawings arising in \
representation theory. The purpose of this package is to ease \
drawing of rank 2 root systems, with Weyl chambers, weight \
lattices, and parabolic subgroups. Required packages are tikz, \
etoolbox, expl3, pgfkeys, pgfopts, xparse, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-rank-2-roots-2023.201.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "78602a98a76281572f19f85104782ad6536e0ef9ec4be43e66b495072d274e3fdd0f49f036de240205146fc664d03963b5bb65990b2d3a2b44add85e5dfb5008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rank-2-roots.sty) texlive-rank-2-roots"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(expl3.sty) tex(pgfkeys.sty) tex(pgfopts.sty) tex(tikz.sty) tex(xparse.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

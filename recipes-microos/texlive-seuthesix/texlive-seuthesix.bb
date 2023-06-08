SUMMARY = "LaTeX class for theses at Southeast University, Nanjing, China"
DESCRIPTION = "This project provides a LaTeX document class as well as a \
bibliography style file for typesetting theses at the Southeast \
University, Nanjing, China. It is based on the seuthesis \
package which, according to the author of seuthesix, is buggy \
and has not been maintained for some time."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0.1svn40088"

RPM_NAME = "texlive-seuthesix-2023.201.1.0.1svn40088-53.1.noarch.rpm"
RPM_HASH = "8695b3ce227cac593fd08d55a08affa2959677c54f7cb206a5b7d1886e1e5040664d3cbb4471e7d1a8e70422d5c73fecfd78665879b3cffad886a177a2f84d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(seuthesix.cfg) tex(seuthesix.cls) texlive-seuthesix"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(algorithm.sty) tex(algorithmic.sty) tex(amsmath.sty) tex(amssymb.sty) tex(amsthm.sty) tex(bm.sty) tex(caption.sty) tex(ctexrep.cls) tex(eso-pic.sty) tex(eucal.sty) tex(eufrak.sty) tex(fancyhdr.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(natbib.sty) tex(nomencl.sty) tex(tocloft.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

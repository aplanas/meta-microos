SUMMARY = "Automated patches for pLaTeX/upLaTeX"
DESCRIPTION = "Japanese pLaTeX/upLaTeX formats and packages often conflict \
with other LaTeX packages which are unaware of pLaTeX/upLaTeX. \
In the worst case, such packages throw a fatal error or end up \
with a wrong output. The goal of this package is that there \
should be no need to worry about such incompatibilities, \
because specific patches are loaded automatically whenever \
necessary. This helps not only to simplify source files, but \
also to make the appearance of working pLaTeX/upLaTeX sources \
similar to those of ordinary LaTeX ones."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.9qsvn64072"

RPM_NAME = "texlive-plautopatch-2023.201.0.0.9qsvn64072-52.1.noarch.rpm"
RPM_HASH = "53babc3446b32e46bebcfab38f01077c313205787cde776d3ca44303d56cbf37cda645a68486fd4dc8ef05d2fa2880e1fac790530e5c2b18bff113e38c7ec832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(plarydshln.sty) \
tex(plautopatch.sty) \
tex(plcollcell.sty) \
tex(plextarydshln.sty) \
tex(plsiunitx.sty) \
tex(pxpgfrcs.sty) \
tex(pxstfloats.sty) \
texlive-plautopatch"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(arydshln.sty) \
tex(collcell.sty) \
tex(colortbl.sty) \
tex(delarray.sty) \
tex(filehook.sty) \
tex(pgfrcs.sty) \
tex(plarray.sty) \
tex(plext.sty) \
tex(plextarray.sty) \
tex(plextcolortbl.sty) \
tex(plextdelarray.sty) \
tex(pxeveryshi.sty) \
tex(siunitx.sty) \
tex(stfloats.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

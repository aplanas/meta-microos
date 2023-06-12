SUMMARY = "LaTeX package for drawing bar diagrams"
DESCRIPTION = "The main purpose of the package is to make the drawing of bar \
diagrams possible and easy in LaTeX. The BarDiag package is \
inspired by and based on PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4asvn22013"

RPM_NAME = "texlive-bardiag-2023.201.0.0.4asvn22013-53.1.noarch.rpm"
RPM_HASH = "d63061b2e6ebfbe790884c140c67144fab43ab1eb6b7609b7f4ff886d56f6fef13fdad76c252b5b50742f48f64334ca137b48b17201a10d228d8b189716fdd34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(barddoc.sty) \
tex(bardiag.cfg) \
tex(bardiag.sty) \
tex(pstfp.sty) \
texlive-bardiag"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(fp-snap.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(ifthen.sty) \
tex(listings.sty) \
tex(makeidx.sty) \
tex(multido.sty) \
tex(pst-grad.sty) \
tex(pstcol.sty) \
tex(pstricks.sty) \
tex(subfigure.sty) \
tex(verbatim.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

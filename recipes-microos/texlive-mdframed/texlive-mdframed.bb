SUMMARY = "Framed environments that can split at page boundaries"
DESCRIPTION = "The package develops the facilities of framed in providing \
breakable framed and coloured boxes. The user may instruct the \
package to perform its operations using default LaTeX commands, \
PStricks or TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9bsvn31075"

RPM_NAME = "texlive-mdframed-2023.201.1.9bsvn31075-52.1.noarch.rpm"
RPM_HASH = "cdab58277ac20d58c2a2ff10e31faf171fc7ed8bfe147166fa3b243e87c5253f97a7c9c4f3e2ffc044138f476671c7663ed42f800384b3bf4c4d3d8201b24d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ltxmdf.cls) \
tex(mdframed.sty) \
texlive-mdframed"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(array.sty) \
tex(beramono.sty) \
tex(booktabs.sty) \
tex(color.sty) \
tex(csquotes.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hypdoc.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(kantlipsum.sty) \
tex(kvoptions.sty) \
tex(l3keys2e.sty) \
tex(lipsum.sty) \
tex(listings.sty) \
tex(microtype.sty) \
tex(multicol.sty) \
tex(needspace.sty) \
tex(ntheorem.sty) \
tex(selinput.sty) \
tex(showframe.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
tex(xspace.sty) \
tex(zref-abspage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

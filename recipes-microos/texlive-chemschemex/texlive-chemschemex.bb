SUMMARY = "Typeset and cross-reference chemical schemes based on TikZ code"
DESCRIPTION = "The package provides a comfortable means of typesetting \
chemical schemes, and also offers automatic structure \
referencing."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn46723"

RPM_NAME = "texlive-chemschemex-2023.201.1.2svn46723-53.1.noarch.rpm"
RPM_HASH = "51d56de38b455ae1a7104bddea7711e64392fceccfbebdab9bbe6cab76f66f00d30f3904b3fde76d795f05a34a1f4abbd06e47020ba28eace3f055e33d587440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chemschemex.sty) \
texlive-chemschemex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(fancylabel.sty) \
tex(graphicx.sty) \
tex(suffix.sty) \
tex(tikz.sty) \
tex(xargs.sty) \
tex(xifthen.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

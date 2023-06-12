SUMMARY = "Generate calling cards for dances"
DESCRIPTION = "A package and a class used to typeset traditional country \
dances, such as contra and square dances, and to create calling \
cards for the same."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.0.0svn50217"

RPM_NAME = "texlive-contracard-2023.204.2.0.0svn50217-54.1.noarch.rpm"
RPM_HASH = "314b9d90b177c7a8559c7e334e6714b71c3987ef60494b1669b030155a5a6d40aeff9b9c62d4dfa28cad59fa752aed5c73e3252a783e59e72efcbc2735ad153d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(contracard.cls) \
tex(contracard.sty) \
texlive-contracard"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(geometry.sty) \
tex(ifthen.sty) \
tex(imakeidx.sty) \
tex(intcalc.sty) \
tex(textcomp.sty) \
tex(titlesec.sty) \
tex(tocloft.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

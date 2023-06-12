SUMMARY = "Draw simple ladder diagrams using TikZ"
DESCRIPTION = "This package permits the creation of simple ladder diagrams \
within LaTeX documents. Required packages are tikz, ifthen, and \
calc."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44394"

RPM_NAME = "texlive-ladder-2023.201.svn44394-55.1.noarch.rpm"
RPM_HASH = "69280b94e084bc38703b3e9361cae8e8ccfea8dcbaa36a313c4f6931543e53b211e36185176e9d360e5e51968fd494e02ee374cafdc57b70c416f86c39affd20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ladder.sty) \
texlive-ladder"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(ifthen.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

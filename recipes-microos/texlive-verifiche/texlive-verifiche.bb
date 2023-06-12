SUMMARY = "A LaTeX package to typeset (Italian) high school tests"
DESCRIPTION = "The purpose of this package is to manage the exercises for a \
test, their points, levels of difficulty, and solutions. Some \
typical formats of exercises are already implemented: Plain \
exercise 'Complete the Text' 'True or false' Closed questions \
Open questions 'Find the error'"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0svn64425"

RPM_NAME = "texlive-verifiche-2023.201.6.0svn64425-53.1.noarch.rpm"
RPM_HASH = "8f69c6ad36533fa55100ba9688ec0e304b31e7dafb346af4e4ce9c17e8465d1b992ba5de5cfb3c98742e9c356a81d907903329ff522caafa519190f28eb5f3b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(verifiche.sty) \
texlive-verifiche"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(booktabs.sty) \
tex(enumitem.sty) \
tex(graphicx.sty) \
tex(pgffor.sty) \
tex(siunitx.sty) \
tex(tikz.sty) \
tex(ulem.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

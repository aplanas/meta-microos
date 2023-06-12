SUMMARY = "A class for drawing guitar tablatures easily"
DESCRIPTION = "This package provides is a simple LaTeX2e class that allows \
guitarists to create basic guitar tablatures using LaTeX. \
Create music and do not be bothered with macro programming. The \
class depends on the LaTeX packages geometry, harmony, \
inputenc, intcalc, musixtex, tikz, and xifthen, as well as the \
article class."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48102"

RPM_NAME = "texlive-guitartabs-2023.201.svn48102-53.1.noarch.rpm"
RPM_HASH = "93917a3956ec5f4dc3497ecec267022924a61a4720cc6c9af9c13511e84b0fda91c0d0528f03f2c81b30cdc3be9384875bff13eee2b5005055fe75c359f3e26f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(guitartabs.cls) \
texlive-guitartabs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(geometry.sty) \
tex(harmony.sty) \
tex(inputenc.sty) \
tex(intcalc.sty) \
tex(musixtex.sty) \
tex(tikz.sty) \
tex(xifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

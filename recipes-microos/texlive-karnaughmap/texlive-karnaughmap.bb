SUMMARY = "Typeset Karnaugh maps"
DESCRIPTION = "This package provides an easy to use interface to typeset \
Karnaugh maps using TikZ. Though similar to the karnaugh \
macros, it provides a key-value system to customize \
karnaughmaps and a proper LaTeX package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn36989"

RPM_NAME = "texlive-karnaughmap-2023.201.2.0svn36989-55.1.noarch.rpm"
RPM_HASH = "cb19917ec43bd1e7684fe7da46ed8cf2b1f8670fad6222cf35c8dfeb7504b7e7b1fee41b80f036494cfd19d997f155f859fc13a27619909bb870d523a8106b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(karnaughmap.sty) \
texlive-karnaughmap"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

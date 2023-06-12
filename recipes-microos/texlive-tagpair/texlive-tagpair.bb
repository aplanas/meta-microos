SUMMARY = "Word-by-word glosses, translations, and bibliographic attributions"
DESCRIPTION = "This package provides environments and commands for pairing \
lines, bottom lines, and tagged lines, intended to be used in \
particular for word-by-word glosses, translations, and \
bibliographic attributions, respectively. This LaTeX package is \
inspired by Marcel R. van der Goot's classic Plain TeX macros \
in gloss.tex."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42138"

RPM_NAME = "texlive-tagpair-2023.201.1.1svn42138-54.1.noarch.rpm"
RPM_HASH = "7afbb837853254d82d34f10236ba95d5836faac14d5d130d40dd8431527c4947469bba1d2f88a37dcf5f33df0d04f4fda4c0fbb8d93fbae21d68e2b602d281d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tagpair.sty) \
texlive-tagpair"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(varwidth.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

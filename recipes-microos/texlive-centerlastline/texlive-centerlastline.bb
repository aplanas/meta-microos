SUMMARY = "Paragraphs with last line centered, known as 'Spanish' paragraphs"
DESCRIPTION = "This LaTeX package provides a command \\centerlastline and an \
environment centerlastline that typeset 'Spanish' paragraphs, \
that is paragraphs without indentation, and last line centered, \
useful to finish a large paragraph of text at the end of \
chapters, prologues, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56644"

RPM_NAME = "texlive-centerlastline-2023.201.1.0svn56644-52.1.noarch.rpm"
RPM_HASH = "5944169e54c1a810dbee704d7a9170b48279e3359ca40103ca4a21539a174bce1e7d4a1a6098fad09ffe408090ea8b264efb86079e89fc14c096ccde42b8ec10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(centerlastline.sty) \
texlive-centerlastline"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

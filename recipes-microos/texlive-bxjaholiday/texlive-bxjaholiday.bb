SUMMARY = "Support for Japanese holidays"
DESCRIPTION = "This LaTeX package provides a command to convert dates to names \
of Japanese holidays. Another command, converting dates to the \
day of the week in Japanese, is available as a free gift. \
Further (lower-level) APIs are provided for expl3. The package \
supports pdfTeX, XeTeX, LuaTeX, pTeX, and upTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn60636"

RPM_NAME = "texlive-bxjaholiday-2023.201.1.1.1svn60636-52.1.noarch.rpm"
RPM_HASH = "ae5bd77cbbb6010ca9f2a4cc038f9a023ab66ac85469548971465ae9aa041cba57dcc91a90d3bad4ac82a06be25e9a13afe91430c8acf0ca4554f22425ca8a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxjaholiday.sty) \
texlive-bxjaholiday"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

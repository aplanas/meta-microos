SUMMARY = "Package for subequation numbering"
DESCRIPTION = "Sometimes it is necessary to be able to refer to subexpressions \
of an equation. In order to do that these subexpressions should \
be numbered. In standard LaTeX there is no provision for this. \
To solve this problem Stephen Gildea once wrote subeqn.sty for \
LaTeX 2.09; Donald Arsenau rewrote the macros and Johannes \
Braams made them available for LaTeX2e. Note that this package \
is not compatible with the package subeqnarray (written by \
Johannes Braams), but it can be used together with the LaTeX \
class options leqno and fleqn."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn15878"

RPM_NAME = "texlive-subeqn-2023.201.2.0bsvn15878-57.1.noarch.rpm"
RPM_HASH = "b2613c8cde6b705c47de66eced2521b60878bfc539a9ff280f352a0a1d609500ebf3377242263a02b040a4c1f2e42fa44132d7384075a9c17637586ad0373400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(subeqn.sty) \
texlive-subeqn"
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

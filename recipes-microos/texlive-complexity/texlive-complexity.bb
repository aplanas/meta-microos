SUMMARY = "Computational complexity class names"
DESCRIPTION = "Complexity is a LaTeX package that defines commands to typeset \
Computational Complexity Classes such as $\\P$ and $\\NP$ (as \
well as hundreds of others). It also offers several options \
including which font classes are typeset in and how many are \
defined (all of them or just the basic, most commonly used \
ones). The package has no dependencies other than the standard \
ifthen package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.81asvn45322"

RPM_NAME = "texlive-complexity-2023.201.0.0.81asvn45322-53.1.noarch.rpm"
RPM_HASH = "90f84c1fc08bedbcbe5fe617c5c2a1b508ebf42483d34a4f9717d189de033a6e3d20b82bec4b41e61a1fbf87544d822e712575dcf2119a0ceaec273a094c73cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(complexity.sty) \
tex(mycomplexity.sty) \
texlive-complexity"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

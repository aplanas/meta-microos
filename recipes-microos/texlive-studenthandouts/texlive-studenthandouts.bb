SUMMARY = "Management and styling of student handout projects"
DESCRIPTION = "This package can be used to generate a single master document \
that contains a set of individual student handouts. The package \
has two main functions. First, it provides a simple framework \
for organizing handout source code, and supplies a set of \
import management tools for selectively importing a subset of \
the handouts into the master document. Selective import is \
convenient when compilation of all of the handouts is \
unnecessary, for example when working on a new handout. As a \
secondary feature, the package defines a basic visual style for \
handouts. This style can be easily changed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn43516"

RPM_NAME = "texlive-studenthandouts-2023.201.1.0svn43516-57.1.noarch.rpm"
RPM_HASH = "a656c8db782551cc4554c587a043e23f843bd7242fca8be197a8f5088705ead2053fccddbe82397f186f2c31608de378a15544c30881d6ca7a5c8341ef34f17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(studenthandouts.sty) \
texlive-studenthandouts"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(changepage.sty) \
tex(fancyhdr.sty) \
tex(fmtcount.sty) \
tex(geometry.sty) \
tex(ifthen.sty) \
tex(tocloft.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

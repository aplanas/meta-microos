SUMMARY = "Welsh hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Welsh in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-welsh-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "24b604ec7d3b8056767dd932874a0cb18e90034d348f4f496631447527f538e291bedb854c1ae290f8ee871a324fe7e2870e665669954a31b0d30e4e53760e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-cy.ec.tex) \
tex(hyph-cy.tex) \
tex(loadhyph-cy.tex) \
texlive-hyphen-welsh"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

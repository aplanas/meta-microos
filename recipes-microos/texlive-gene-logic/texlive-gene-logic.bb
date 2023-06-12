SUMMARY = "Typeset logic formulae, etcetera"
DESCRIPTION = "The package provides a facility to typeset certain logic \
formulae. It provides an environment like eqnarray, a \
newtheorem-like environment (NewTheorem), and several macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn15878"

RPM_NAME = "texlive-gene-logic-2023.201.1.4svn15878-52.1.noarch.rpm"
RPM_HASH = "ce99c4367d1e8720fddcd31a8637b2732eadc0834e7aa1aa001eda275306b4ded6c8368659e611f328c89b1c1c1a22a03b41a0a25047e4f1ecdf4e58a8808bd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gn-logic14.sty) \
texlive-gene-logic"
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

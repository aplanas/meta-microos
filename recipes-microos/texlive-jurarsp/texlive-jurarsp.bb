SUMMARY = "Citations of judgements and official documents in (German) juridical documents"
DESCRIPTION = "This package should be helpful for people working on (German) \
law. It (ab)uses BibTeX for citations of judgements and \
official documents. For this purpose, a special BibTeX-style is \
provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.52svn15878"

RPM_NAME = "texlive-jurarsp-2023.201.0.0.52svn15878-55.1.noarch.rpm"
RPM_HASH = "07a6f4d40f813a88cea849f44912195b47a9f569bd040f664f399e3ef8a274bcb4f0ddc5d1254a7f2880efc8f580eb249333d4a88f1abb77efc98668a2040444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jurarsp.cfg) \
tex(jurarsp.sty) \
texlive-jurarsp"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(ifthen.sty) \
tex(keyval.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

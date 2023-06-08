SUMMARY = "Document class and bibliography style for Lecture Notes in Computer Science (LNCS)"
DESCRIPTION = "This is Springer's official macro package for typesetting \
contributions to be published in Springer's Lecture Notes in \
Computer Science (LNCS) and its related proceedings series \
CCIS, LNBIP, LNICST, and IFIP AICT."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.22svn64299"

RPM_NAME = "texlive-llncs-2023.201.2.22svn64299-54.1.noarch.rpm"
RPM_HASH = "ccabd7682c1a14894314e0ab144936225a0c48c726541a96f75c50860db38a9a1b6c65294a55e6b407516a510799de2b8ae776fb8b26d20c664256cd20e9c421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(llncs.cls) texlive-llncs"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(aliascnt.sty) tex(article.cls) tex(multicol.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

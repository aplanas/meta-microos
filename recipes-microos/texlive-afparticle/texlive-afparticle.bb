SUMMARY = "Typesetting articles for Archives of Forensic Psychology"
DESCRIPTION = "This package provides a class for typesetting articles for the \
open access journal Archives of Forensic Psychology."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn35900"

RPM_NAME = "texlive-afparticle-2023.201.1.3svn35900-54.1.noarch.rpm"
RPM_HASH = "3450fe6a028f103fe3fb5734af6fe66f03634bbae5a023c5ff62ada131aca3b1fb240eec5c6934495179a5d40815423135dce4d279091c2a1ab2faaf204ba49f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(afparticle.cls) \
texlive-afparticle"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(apacite.sty) \
tex(booktabs.sty) \
tex(caption.sty) \
tex(elsarticle.cls) \
tex(fancyhdr.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(lastpage.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

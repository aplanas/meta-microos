SUMMARY = "Bibliography style for the ASCE"
DESCRIPTION = "A document class and bibliographic style that prepares \
documents in the style required by the American Society of \
Civil Engineers (ASCE). These are unofficial files, not \
sanctioned by that organization, and the files specifically \
give this caveat. Also included is a short \
documentation/example of how to use the class."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn29129"

RPM_NAME = "texlive-ascelike-2023.201.2.3svn29129-53.1.noarch.rpm"
RPM_HASH = "1f7bf3b61b6ad13c2db140e7eba2b66155b2c21ba0fd541c1ff2afa28940d3c6dafbd0f3801713b235014cd04571a5b873844005edcd9ab8c904c7e273107ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ascelike.cls) \
texlive-ascelike"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(endfloat.sty) \
tex(ifthen.sty) \
tex(lineno.sty) \
tex(setspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

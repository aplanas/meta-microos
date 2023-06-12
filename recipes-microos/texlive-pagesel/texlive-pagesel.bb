SUMMARY = "Select pages of a document for output"
DESCRIPTION = "Selects single pages, ranges of pages, odd pages or even pages \
for output. The package is part of the oberdiek bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn56105"

RPM_NAME = "texlive-pagesel-2023.201.1.10svn56105-51.1.noarch.rpm"
RPM_HASH = "0798f5f1d05cc82697d7b30daf2a6a874945f6c68b99593f9b6680f2813dcfb905bb27596242d45e16e9972b2a4f6dec1454f6075d6289204f8d97454e1e677b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pagesel-2016-05-16.sty) \
tex(pagesel.sty) \
texlive-pagesel"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(everyshi.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

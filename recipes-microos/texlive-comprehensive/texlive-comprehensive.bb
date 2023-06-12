SUMMARY = "Symbols accessible from LaTeX"
DESCRIPTION = "Over 18000 symbols are listed as a set of tables. The tables of \
symbols are ordered in a logical way (the document begins with \
a 'frequently requested symbols' list), the aim being to make \
the document a convenient way of looking up symbols."
LICENSE = "LPPL-1.0"

PV = "2023.201.14.0svn59099"

RPM_NAME = "texlive-comprehensive-2023.201.14.0svn59099-53.1.noarch.rpm"
RPM_HASH = "07f4d871be2c69b760ddd1d0b3d1f40f9487504e983a40722a3892b31c69c827ed57f7ae0e2a169c61d347ebc65b7bdeb683240bfb5505835a3b74e42c7e3ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comprehensive"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
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

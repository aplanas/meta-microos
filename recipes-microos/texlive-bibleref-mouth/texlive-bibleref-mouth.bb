SUMMARY = "Consistent formatting of Bible references"
DESCRIPTION = "The package allows Bible references to be formatted in a \
consistent way. It is similar to the bibleref package, except \
that the formatting macros are all purely expandable -- that \
is, they are all implemented in TeX's mouth. This means that \
they can be used in any expandable context, such as an argument \
to a \\url command."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25527"

RPM_NAME = "texlive-bibleref-mouth-2023.201.1.0svn25527-53.1.noarch.rpm"
RPM_HASH = "ef391c3c8131210a4c6dd42108d7d1de8b0bf4472fbd8a1e13f2ed0cf3afcb6d85ddfbc8940dfb30a10dfcbc8a28700fc4c05ec7c7ea66a4fa538eee8317e97b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bibleref-mouth.sty) \
texlive-bibleref-mouth"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fmtcount.sty) \
tex(hyperref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

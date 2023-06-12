SUMMARY = "Systematic treatment of 'foreign' words in documents"
DESCRIPTION = "The package supports authors' use of consistent typesetting of \
foreign words in documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn27819"

RPM_NAME = "texlive-foreign-2023.201.2.7svn27819-52.1.noarch.rpm"
RPM_HASH = "9547f6278288f132a5d5e56ee96c57d6f15320580ab8e66e64181c60588da419c255eacc866d2a9b6b9decaab9a05091c30b122bfb78601c8937649f473d6b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(foreign.sty) \
texlive-foreign"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xpunctuate.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

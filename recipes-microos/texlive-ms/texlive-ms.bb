SUMMARY = "Various LaTeX packages by Martin Schroder"
DESCRIPTION = "The remains of a bundle of LaTeX packages by Martin Schroder; \
the collection still comprises: count1to, make use of TeX \
counters; and multitoc, typeset the table of contents in \
multiple columns. ragged2e, prelim2e, everyshi (obsolete), and \
everysel (obsolete), which used to be part of this bundle, have \
become independent packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57473"

RPM_NAME = "texlive-ms-2023.201.svn57473-54.1.noarch.rpm"
RPM_HASH = "0a0d9475dd86e1b774ae9383a4e84149483911bdf9116a8d506a123fa0ea8514164bad85297af10aecf3f27be8fb373ed13aa77f7289a1480d88c63642a91aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(count1to.sty) \
tex(multitoc.sty) \
texlive-ms"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(everyshi.sty) \
tex(ifthen.sty) \
tex(multicol.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

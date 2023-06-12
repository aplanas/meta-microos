SUMMARY = "Format DNA base sequences"
DESCRIPTION = "Defines a means of specifying sequences of bases. The bases may \
be numbered (per line) and you may specify that subsequences be \
coloured. For a more 'vanilla-flavoured' way of typesetting \
base sequences, the user might consider the seqsplit package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn17194"

RPM_NAME = "texlive-dnaseq-2023.201.0.0.01svn17194-52.1.noarch.rpm"
RPM_HASH = "8e1b143016302981ea231fe5e2f2bedca1a831bfa486190e8a7c5fe8365f028aca7b4c46e05e716f518f66cbc2ed75fb4b8411e76be4dfcfa65470f5918fa7f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dnaseq.sty) \
texlive-dnaseq"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

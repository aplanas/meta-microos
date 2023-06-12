SUMMARY = "Attach files into PDF"
DESCRIPTION = "This package can be used to attach files to a PDF document. It \
is a further development of Scott Pakin's package attachfile \
for pdfTeX. Apart from bug fixes, this package adds support for \
dvips, some new options, and gets and writes meta information \
data about the attached files."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.11svn57959"

RPM_NAME = "texlive-attachfile2-2023.201.2.11svn57959-53.1.noarch.rpm"
RPM_HASH = "3034cebb1d4e4eb47b86cf84afbac6871ba84b4567ed4f311bdd461b6f960ad124ca6971e7071ceb66e34c66c6df9e23658ba3ac12bd363c793a41f2022700b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(atfi-dvipdfmx.def) \
tex(atfi-dvips.def) \
tex(atfi-luatex.def) \
tex(atfi-pdftex.def) \
tex(attachfile2.sty) \
texlive-attachfile2"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Digest::MD5) \
perl(Getopt::Long) \
perl(POSIX) \
perl(strict) \
sed \
tex(color.sty) \
tex(hycolor.sty) \
tex(hyperref.sty) \
tex(iftex.sty) \
tex(infwarerr.sty) \
tex(keyval.sty) \
tex(kvoptions.sty) \
tex(ltxcmds.sty) \
tex(pdfescape.sty) \
tex(pdftexcmds.sty) \
texlive \
texlive-attachfile2-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

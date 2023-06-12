SUMMARY = "Typeset exams with scrambled questions and answers"
DESCRIPTION = "The package enables the user to typeset exams with multiple \
choice, open questions and many other types of exercise. Both \
questions and answers may be randomly distributed within the \
exam, and the solutions are typeset automatically. Exercises \
may contain a wide number of random parameters and it is \
possible to do arithmetical operations on them. The package is \
localised in Italian, English, French, German, Greek, Serbian, \
and Spanish."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn61596"

RPM_NAME = "texlive-esami-2023.201.2.7svn61596-53.1.noarch.rpm"
RPM_HASH = "fc505accc538c3752e2657aba2829086a473b58afe8fbaea649c38860cbc58cb39ea61e38d74f1bf057a35d0dde435e295297f2959656745606cb5ffcbc5fbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(esami.sty) \
texlive-esami"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(array.sty) \
tex(auto-pst-pdf.sty) \
tex(currfile.sty) \
tex(enumerate.sty) \
tex(environ.sty) \
tex(fp.sty) \
tex(graphicx.sty) \
tex(ifthen.sty) \
tex(multicol.sty) \
tex(pstricks-add.sty) \
tex(pstricks.sty) \
tex(xargs.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

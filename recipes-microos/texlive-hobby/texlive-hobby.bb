SUMMARY = "An implementation of Hobby's algorithm for PGF/TikZ"
DESCRIPTION = "This package defines a path generation function for PGF/TikZ \
which implements Hobby's algorithm for a path built out of \
Bezier curves which passes through a given set of points. The \
path thus generated may by used as a TikZ 'to path'. The \
implementation is in LaTeX3."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn44474"

RPM_NAME = "texlive-hobby-2023.201.1.8svn44474-53.1.noarch.rpm"
RPM_HASH = "4b297e60b5418f716a3cf2ec180b411b5723b39c9bbccdab2fb6a15edd48df233a5d53c61aa166560808e8c8d09ef99c26635f2723ae38831f63039c0312553d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hobby.code.tex) tex(pgflibraryhobby.code.tex) tex(pml3array.sty) tex(tikzlibraryhobby.code.tex) texlive-hobby"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

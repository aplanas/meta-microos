SUMMARY = "Origami-style folding paper CD case"
DESCRIPTION = "This package implements a LaTeX style file to produce \
origami-style folding paper CD cases."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-papercdcase-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "3ab10e411adbe8e1ab0c4c0b8745d16f5653d53c0a19e00ccd59a0f26654f2d195f7ed0dad5723a5388e8b55579cb78a7583b0377502060fb202f6f1f7e0559b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(papercdcase.sty) texlive-papercdcase"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(graphicx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

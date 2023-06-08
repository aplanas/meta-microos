SUMMARY = "A LaTeX class for theses at the Faculty Of Graphic Arts in Zagreb"
DESCRIPTION = "This class is intended for generating graduate and final theses \
according to the instructions of the Faculty of Graphic Arts, \
University of Zagreb. It does not necessarily correspond to the \
requirements of each component of the University, but is \
designed as an idea for linking and uniformizing the look of \
all graduate papers. Anyone who likes it is welcome to use it."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51647"

RPM_NAME = "texlive-unizgklasa-2023.201.1.0svn51647-53.1.noarch.rpm"
RPM_HASH = "496c5f3304b7f63cec35d3f919ffb595336742cadbcd60d7306a21791efea24c91c8ebc582d4798131c17f49275b9a6ec732bcc227b4a1e4dc79e3ecf538d7f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unizgklasa.cls) texlive-unizgklasa"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(babel.sty) tex(caption.sty) tex(fancyhdr.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(subcaption.sty) tex(titlesec.sty) tex(tocbibind.sty) tex(upgreek.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

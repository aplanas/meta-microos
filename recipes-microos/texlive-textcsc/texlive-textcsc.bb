SUMMARY = "Simple commands for caps-to-small-caps text"
DESCRIPTION = "This package provides a simple command (\\textcsc and \\cscshape) \
for caps-to-small-caps text, to allow for small caps acronyms \
to be presented as uppercase in text (useful for things like \
copying and pasting from a PDF)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn64935"

RPM_NAME = "texlive-textcsc-2023.201.1.0.1svn64935-54.1.noarch.rpm"
RPM_HASH = "f52b0d5b248fecc35ec87f7f99b22f77336124da90729069ed1a05078716626303dcf750637d65a8ac258a6932ce71b7851b6314c3d48a4de4995a5ed4b13021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(textcsc.sty) texlive-textcsc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontspec.sty) tex(iftex.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

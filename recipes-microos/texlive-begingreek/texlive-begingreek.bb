SUMMARY = "Greek environment to be used with pdfLaTeX only"
DESCRIPTION = "This simple package defines a greek environment to be used with \
pdfLaTeX only, that accepts an optional Greek font family name \
to type its contents with. A similar \\greektxt command does a \
similar action for shorter texts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn63255"

RPM_NAME = "texlive-begingreek-2023.201.1.7svn63255-53.1.noarch.rpm"
RPM_HASH = "f2c49b0cd2d88cd4af7489cc687003b2044f8946b5f84cc2e7c18a1abede737f520211ed542180c62af5db2771c08d43bec9d258969760afe8caa808e23cf3e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(begingreek.sty) texlive-begingreek"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(iftex.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

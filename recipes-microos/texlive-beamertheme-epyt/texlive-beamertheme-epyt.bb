SUMMARY = "A simple and clean theme for LaTeX beamer class"
DESCRIPTION = "This package provides a simple but nice theme for Beamer, with \
the following features: simple structure: with page numbers at \
footer, no head bar and side bar simple templates: displaying \
theorems with traditional inline style simple colors: using \
only several foreground and background colors"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41404"

RPM_NAME = "texlive-beamertheme-epyt-2023.201.1.0svn41404-53.1.noarch.rpm"
RPM_HASH = "1e68083a6a7f06f4404d5540fae7f42a3e22e4965b0bf90e7eee8608714c986404a36c32788afbeef69603ec2c75e54d91a837e88b4b81d31bb4faf8a6f7e751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamerthemeepyt.sty) texlive-beamertheme-epyt"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(arev.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

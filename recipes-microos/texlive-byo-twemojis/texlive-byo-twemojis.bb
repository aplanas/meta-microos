SUMMARY = "'Build Your Own Twemojis' with TikZ"
DESCRIPTION = "This package provides the means to create your own emojis (the \
simple, round, and mostly yellow ones) from elements of \
existing emojis. The provided command creates a TikZ picture \
from the stated elements with multiple possibilities to modify \
the result in color and position."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn58917"

RPM_NAME = "texlive-byo-twemojis-2023.201.1.0svn58917-52.1.noarch.rpm"
RPM_HASH = "97af9b0e672859f393ff721e7f604ae5a5feede2f755aa5c9385b6b49acd4559e6c3f439adde927aa5db9cd0f129c8d387fe1c0acc1c8b66247be217472a275e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(byo-twemojis.sty) texlive-byo-twemojis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(tikz.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

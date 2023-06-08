SUMMARY = "Describe card games"
DESCRIPTION = "This package provides a font with LuaLaTeX support for \
describing card games."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-2023.201.1.2asvn54512-53.1.noarch.rpm"
RPM_HASH = "c6259e16f61abfc8fc58048b46a7db6a56ebd2ed14c5c758de4bff4eac5cc9be6a20a9e2302efaed10b31686fd72cf26b9e13916c868c60cb64a10c2d04df81c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hmtrump.sty) texlive-hmtrump"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontspec.sty) tex(tikz.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-hmtrump-fonts texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

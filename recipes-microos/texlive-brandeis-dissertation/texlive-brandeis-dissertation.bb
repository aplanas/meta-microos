SUMMARY = "Class for Brandeis University dissertations"
DESCRIPTION = "The class will enable the user to typeset a dissertation which \
adheres to the formatting guidelines of Brandeis University \
Graduate School of Arts and Sciences (GSAS)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.13svn61215"

RPM_NAME = "texlive-brandeis-dissertation-2023.201.3.13svn61215-52.1.noarch.rpm"
RPM_HASH = "a1f716ae04154d184e3ec9c66829878358b39c758067becb07b6a117d7a64a1aee2a99ccb9c578614a77db2821d1cc8d3ee0953726d36bfbddbda0e9fa738fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(brandeis-dissertation.cls) texlive-brandeis-dissertation"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(babel.sty) tex(book.cls) tex(csquotes.sty) tex(geometry.sty) tex(inputenc.sty) tex(setspace.sty) tex(titlesec.sty) tex(tocloft.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

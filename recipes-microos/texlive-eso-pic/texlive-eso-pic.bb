SUMMARY = "Add picture commands (or backgrounds) to every page"
DESCRIPTION = "The package adds one or more user commands to LaTeX's shipout \
routine, which may be used to place the output at fixed \
positions. The grid option may be used to find the correct \
places."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0asvn56658"

RPM_NAME = "texlive-eso-pic-2023.201.3.0asvn56658-52.1.noarch.rpm"
RPM_HASH = "bce2f4be8c0ecf04382331aa95c5b86502faaa9da9adf288c0d4b641c863dfb15c9b48c49669b39a858e2bbebc0a96df982cad21d6d76c5447b9843f24c659a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eso-pic.sty) tex(showframe.sty) texlive-eso-pic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(keyval.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

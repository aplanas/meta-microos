SUMMARY = "Notes after every paragraph (or elsewhere)"
DESCRIPTION = "The package provides the \\parnote command. The notes are set as \
(normal) running paragraphs; placement is at the end of each \
paragraph, or manually, using the \\parnotes command."
LICENSE = "LPPL-1.0"

PV = "2023.201.3bsvn51720"

RPM_NAME = "texlive-parnotes-2023.201.3bsvn51720-51.1.noarch.rpm"
RPM_HASH = "d1ed0cb7864345a5ec7e08699e11378bc1cceac3bb16b984cda36c14c62da45aca78d1a9675f4fbb71fe4ea8a78c3279d2e174e912901c3d6a20d983fd69c2fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(parnotes.sty) texlive-parnotes"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

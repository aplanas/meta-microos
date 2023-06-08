SUMMARY = "Library for genealogytree aiming at large trees"
DESCRIPTION = "The main goal of this package is to offer additional database \
fields and formats for the genealogytree package, particularly \
for typesetting large trees. The package depends on \
genealogytree and etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn49062"

RPM_NAME = "texlive-gtrlib-largetrees-2023.201.1.2bsvn49062-53.1.noarch.rpm"
RPM_HASH = "6d147511312578418e8a18f5e969d43376ce272e0d6a006527379b29b135575ae1c3e98bc39a78a7ba4795ed9ff4b6173a4a05061a8a526e5900b7e08be88181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gtrlib.largetrees.code.tex) tex(gtrlib.largetrees.sty) texlive-gtrlib-largetrees"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(genealogytree.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

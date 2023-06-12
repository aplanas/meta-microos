SUMMARY = "Replace strings in encapsulated PostScript figures"
DESCRIPTION = "Allows LaTeX constructions (equations, picture environments, \
etc.) to be precisely superimposed over Encapsulated PostScript \
figures, using your own favorite drawing tool to create an EPS \
figure and placing simple text 'tags' where each replacement is \
to be placed, with PSfrag automatically removing these tags \
from the figure and replacing them with a user specified LaTeX \
construction, properly aligned, scaled, and/or rotated."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.04svn15878"

RPM_NAME = "texlive-psfrag-2023.201.3.04svn15878-52.1.noarch.rpm"
RPM_HASH = "a2eaf44b5fe26f38f527ed638e1e477136e6527f8a05d44942006e4508df5893e9ab510cc5a4b634afe0055112005a2a985c7e16b21eabbbbc0fb454280ac86e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(psfrag.sty) \
texlive-psfrag"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphics.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

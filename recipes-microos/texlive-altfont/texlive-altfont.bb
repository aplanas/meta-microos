SUMMARY = "Alternative font handling in LaTeX"
DESCRIPTION = "The package provides a replacement for that part of psnfss and \
mfnfss that changes the default font. The package is \
distributed together with the psfont package, by the same \
author."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-altfont-2023.201.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "c6e387ffc715e38c993489614cca3ec917e963b8ddff53855204f834e817e06099f1163217c180f23a2140b809035413931130b84a7a886aa04417fa1b6bd1ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(altfont.cfg) \
tex(altfont.sty) \
tex(psfont.cfg) \
tex(psfont.sty) \
texlive-altfont"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

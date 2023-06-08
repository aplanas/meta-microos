SUMMARY = "Fonts for typesetting classical greek"
DESCRIPTION = "These fonts are derivatives of Kunth's CM fonts. Macros for use \
with Plain TeX are included in the package; for use with LaTeX, \
see lgreek (with English documentation) or levy (with German \
documentation)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn21750"

RPM_NAME = "texlive-levy-2023.201.svn21750-54.1.noarch.rpm"
RPM_HASH = "05880d716537c94adbe4027941a4d148ca0ce8ae4a40e4615fb74cad4f65491b3d0ce72c8f5aec7d6b814ad7ffcc1f410de23c9c425b79ce6159ab2ca968a223"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(grbld10.tfm) tex(grbld8.tfm) tex(grbld9.tfm) tex(greekmacros.tex) tex(grreg10.tfm) tex(grreg8.tfm) tex(grreg9.tfm) tex(slgreek.sty) texlive-levy"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

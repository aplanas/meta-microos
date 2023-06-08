SUMMARY = "The StarFont Sans astrological font"
DESCRIPTION = "The package contains StarFontSans and StarFontSerif, two \
public-domain astrological fonts designed by Anthony I.P. Owen, \
and the appropriate macros to use them with TeX and LaTeX. The \
fonts are supplied both in the original TrueType Format and in \
Adobe Type 1 format."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn19982"

RPM_NAME = "texlive-starfont-2023.201.1.2svn19982-57.1.noarch.rpm"
RPM_HASH = "4eadef07f8f2652323ff285052ebe6ed098ad7ce27a70b284995328ecec4d0c8eaaa21c5ab0f954065ce6a3b12a0aa28ec3fbf975fe6838a69e96fe38cb7cfd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fstr8x.tfm) tex(fsts8x.tfm) tex(starfont.map) tex(starfont.sty) texlive-starfont"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-starfont-fonts"

inherit rpm

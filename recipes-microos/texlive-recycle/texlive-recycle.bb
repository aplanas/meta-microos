SUMMARY = "A font providing the 'recyclable' logo"
DESCRIPTION = "This single-character font is provided as Metafont source, and \
in Adobe Type 1 format. It is accompanied by a trivial LaTeX \
package to use the logo at various sizes."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-recycle-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "6a8d40b84d5db089ef89258b73aa2d4ddc24e43d1804af2419e631f344176324c07c932df0486d3a1ac42fb00d922ebc3d77020443b4e65ca6ee727d17801c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(recycle.map) \
tex(recycle.sty) \
tex(recycle.tfm) \
texlive-recycle"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-recycle-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

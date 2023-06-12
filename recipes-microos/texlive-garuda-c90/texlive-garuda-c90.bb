SUMMARY = "TeX support (from CJK) for the garuda font"
DESCRIPTION = "The garuda-c90 package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn60832"

RPM_NAME = "texlive-garuda-c90-2023.201.svn60832-52.1.noarch.rpm"
RPM_HASH = "2668e4b32209161dddb9fedae45cf9538ded0b8415207064d904438d9dcf6ed26c120ab183117175b53c18e3a5724c4cf8fee4c1fa1de67553342785921f43b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fgdb8z.tfm) \
tex(fgdbo8z.tfm) \
tex(fgdo8z.tfm) \
tex(fgdr8z.tfm) \
tex(garuda-c90.map) \
texlive-garuda-c90"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-fonts-tlwg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "A commutative diagram package using LAMSTeX or Xy-pic fonts"
DESCRIPTION = "The pb-diagram package"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0svn15878"

RPM_NAME = "texlive-pb-diagram-2023.201.5.0svn15878-51.1.noarch.rpm"
RPM_HASH = "a0dc4803f312f0deac9af779b15a10bc101286904d2cdafb80fd333ceaf8526ffedaaac31fde0c2793d7ce5ea7a1ee9f3c9efaab47f7379d8d2a8a0a9a5260c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lamsarrow.sty) \
tex(pb-diagram.sty) \
tex(pb-lams.sty) \
tex(pb-xy.sty) \
texlive-pb-diagram"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

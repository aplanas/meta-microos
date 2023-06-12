SUMMARY = "Customize superscripts and subscripts"
DESCRIPTION = "This package provides three commands \\super, \\sub and \\supersub \
to improve the layout of superscripts and subscripts which can \
be adjusted with respect to relative position and format, and \
can be used in text and math mode."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.42svn64706"

RPM_NAME = "texlive-spbmark-2023.201.1.42svn64706-57.1.noarch.rpm"
RPM_HASH = "8732769ee19b621b2119fe83f5669e20f5fa3a9c76700b4c45e189aac4b06eb8f4a540f3f2232519bed0a5354851066f37ac3d425052b6519aa11da8bec43638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spbmark.sty) \
texlive-spbmark"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(l3keys2e.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

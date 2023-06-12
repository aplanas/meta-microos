SUMMARY = "Display various elements of a document's layout"
DESCRIPTION = "Display information about a document, including: text \
positioning on a page; disposition of floats; layout of \
paragraphs, lists, footnotes, table of contents, and sectional \
headings; font boxes. Facilities are provided for a document \
designer to experiment with the layout parameters."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6dsvn42428"

RPM_NAME = "texlive-layouts-2023.201.2.6dsvn42428-54.1.noarch.rpm"
RPM_HASH = "4b2d1db078a361670e62f4e935cba32eeac5da2d9d3cfb636234771ef0af0c341b3e1103250a783939301aa3f281209b3a61c89387e8d28d00a808f3153f3b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(layouts.sty) \
texlive-layouts"
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

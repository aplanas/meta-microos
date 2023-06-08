SUMMARY = "Marking of hyphenation points"
DESCRIPTION = "The package shows the hyphenation points in the document by \
either inserting small triangles below the baseline or by \
typesetting explicit hyphens. The markers are correctly placed \
even within ligatures and their size adjusts to the font size. \
By option the markers can be placed behind or in front of the \
glyphs. The package requires LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn63578"

RPM_NAME = "texlive-showhyphenation-2023.201.0.0.1asvn63578-53.1.noarch.rpm"
RPM_HASH = "5bcf8d8fa14c7c438377a2ce4babf0e733486f99a11d5eb3f1beb3373b77840003cd35ffb04ba9a7ee8eccb1217a685368c21ffc44e3730ca231a98e333c9ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(showhyphenation.sty) texlive-showhyphenation"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifluatex.sty) tex(luatexbase.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

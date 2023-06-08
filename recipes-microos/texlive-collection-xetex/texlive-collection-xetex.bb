SUMMARY = "XeTeX and packages"
DESCRIPTION = "Packages for XeTeX, the Unicode/OpenType-enabled TeX by \
Jonathan Kew, http://tug.org/xetex."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64951"

RPM_NAME = "texlive-collection-xetex-2023.201.svn64951-56.1.noarch.rpm"
RPM_HASH = "f8e3d0a078e2040564ef52a8c698769e58d7ebba64d675368bd6efcb02f067e8e4225c42cf7d3bb0598b542fa837058cd7618cf91cc43a923e2f87447e3afc33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xetex) texlive-collection-xetex"
RDEPENDS:${PN} += "texlive-arabxetex texlive-awesomebox texlive-bidi-atbegshi texlive-bidicontour texlive-bidipagegrid texlive-bidipresentation texlive-bidishadowtext texlive-businesscard-qrcode texlive-collection-basic texlive-cqubeamer texlive-fixlatvian texlive-font-change-xetex texlive-fontbook texlive-fontwrap texlive-interchar texlive-na-position texlive-philokalia texlive-ptext texlive-realscripts texlive-simple-resume-cv texlive-simple-thesis-dissertation texlive-tetragonos texlive-ucharclasses texlive-unicode-bidi texlive-unimath-plain-xetex texlive-unisugar texlive-xebaposter texlive-xechangebar texlive-xecolor texlive-xecyr texlive-xeindex texlive-xelatex-dev texlive-xesearch texlive-xespotcolor texlive-xetex texlive-xetex-itrans texlive-xetex-pstricks texlive-xetex-tibetan texlive-xetexconfig texlive-xetexfontinfo texlive-xetexko texlive-xevlna texlive-zbmath-review-template"

inherit rpm

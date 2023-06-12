SUMMARY = "A font with the images of the countries of Europe"
DESCRIPTION = "The bundle provides a font 'CountriesOfEurope' (in Adobe Type 1 \
format) and the necessary metrics, together with LaTeX macros \
for its use. The font provides glyphs with a filled outline of \
the shape of each country; each glyph is at the same \
cartographic scale."
LICENSE = "OFL-1.1"

PV = "2023.204.0.0.23svn54512"

RPM_NAME = "texlive-countriesofeurope-2023.204.0.0.23svn54512-54.1.noarch.rpm"
RPM_HASH = "538ac66ac7dcc86d12c4759b90f71ab83a0679c4213bb86f338de9ef47b520bb6b081e348aa35d3d8d4dc356db5c76b3a2fe93c9e02b521a436e587b8b23ad17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(countriesofeurope.enc) \
tex(countriesofeurope.map) \
tex(countriesofeurope.sty) \
tex(countriesofeurope.tfm) \
texlive-countriesofeurope"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(graphicx.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-countriesofeurope-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

SUMMARY = "Halle Institute for Economic Research (IWH) Discussion Papers"
DESCRIPTION = "The document class is for creating Discussion Papers of the \
Halle Institute for Economic Research (IWH) in Halle, Germany. \
The class offers options for both English and German texts."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.50svn37552"

RPM_NAME = "texlive-iwhdp-2023.201.0.0.50svn37552-55.1.noarch.rpm"
RPM_HASH = "5fcd5dd798b5e0ab457667775e0f8f290116786c8d06c2a3d054b4f24bd6ffc3e8479f823eb38295280ba0b5028931e006ba754c251e6733e38cbca75ed18193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(iwhdp.cls) \
texlive-iwhdp"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(array.sty) \
tex(babel.sty) \
tex(booktabs.sty) \
tex(color.sty) \
tex(csquotes.sty) \
tex(datenumber.sty) \
tex(dcolumn.sty) \
tex(float.sty) \
tex(fontenc.sty) \
tex(footmisc.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(inputenc.sty) \
tex(lineno.sty) \
tex(lmodern.sty) \
tex(longtable.sty) \
tex(lscape.sty) \
tex(microtype.sty) \
tex(multicol.sty) \
tex(pdfpages.sty) \
tex(pifont.sty) \
tex(rotating.sty) \
tex(sansmath.sty) \
tex(setspace.sty) \
tex(suffix.sty) \
tex(textcomp.sty) \
tex(textpos.sty) \
tex(universalis.sty) \
tex(wallpaper.sty) \
tex(xifthen.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

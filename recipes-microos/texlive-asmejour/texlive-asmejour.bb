SUMMARY = "A template for ASME journal papers"
DESCRIPTION = "The asmejour class provides a template to format preprints \
submitted to ASME journals. The layout and reference formats \
closely follow the style that is currently being used for \
published papers. The class is intended to be used with the \
asmejour.bst BibTeX style, which is part of this distribution. \
Unlike older ASME LaTeX templates, asmejour pdfs will contain \
hyperlinks, bookmarks, and metadata, and references can include \
the DOI and URL fields. Options include line numbering, final \
column balancing, various math options, government copyright, \
and archivability (PDF/A). The class is compatible with \
pdfLaTeX or LuaLaTeX. This package is not a publication of \
ASME."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn65405"

RPM_NAME = "texlive-asmejour-2023.201.1.20svn65405-53.1.noarch.rpm"
RPM_HASH = "2dc32bd2e299513e65f88ba04b96953a3c9504d2e65de9b68bb737ccc7364dc472988141ecb22d30452056d94438d26f0fef29b4377d3390661c05650f99d81e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(asmejour.cls) texlive-asmejour"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(babel.sty) tex(bm.sty) tex(bookmark.sty) tex(booktabs.sty) tex(caption.sty) tex(dcolumn.sty) tex(doi.sty) tex(enumitem.sty) tex(etoolbox.sty) tex(extarticle.cls) tex(fancyhdr.sty) tex(flushend.sty) tex(fnpos.sty) tex(fontenc.sty) tex(geometry.sty) tex(glyphtounicode.tex) tex(graphicx.sty) tex(hologo.sty) tex(hyperref.sty) tex(hyperxmp.sty) tex(iftex.sty) tex(ifthen.sty) tex(inconsolata.sty) tex(inputenc.sty) tex(kvoptions.sty) tex(lineno.sty) tex(mathalfa.sty) tex(mathtools.sty) tex(metalogo.sty) tex(natbib.sty) tex(newtxmath.sty) tex(newtxtext.sty) tex(pdfmanagement-testphase.sty) tex(subcaption.sty) tex(titlesec.sty) tex(totcount.sty) tex(xcoffins.sty) tex(xcolor.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

SUMMARY = "Include PDF documents in LaTeX"
DESCRIPTION = "This package simplifies the inclusion of external multi-page \
PDF documents in LaTeX documents. Pages may be freely selected \
and similar to psnup it is possible to put several logical \
pages onto each sheet of paper. Furthermore a lot of hypertext \
features like hyperlinks and article threads are provided. The \
package supports pdfTeX (pdfLaTeX) and VTeX. With VTeX it is \
even possible to use this package to insert PostScript files, \
in addition to PDF files."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5xsvn65319"

RPM_NAME = "texlive-pdfpages-2023.201.0.0.5xsvn65319-51.1.noarch.rpm"
RPM_HASH = "63889d6673db2199eda6ea848df90ca328606ba050c34390401ba2ca81a2923c8aeebf8fa795588de089157f0b437d491e84597946a41e3ae8f66775188b1991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfpages.sty) \
tex(ppdvipdfmx.def) \
tex(ppdvips.def) \
tex(ppluatex.def) \
tex(ppnull.def) \
tex(pppdftex.def) \
tex(ppvtex.def) \
tex(ppxetex.def) \
texlive-pdfpages"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(count1to.sty) \
tex(dvipdfmx.def) \
tex(eso-pic.sty) \
tex(graphicx.sty) \
tex(ifthen.sty) \
tex(pdflscape.sty) \
texlive \
texlive-eso-pic \
texlive-filesystem \
texlive-graphics \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oberdiek \
texlive-scripts \
texlive-scripts-bin \
texlive-tools"

inherit rpm

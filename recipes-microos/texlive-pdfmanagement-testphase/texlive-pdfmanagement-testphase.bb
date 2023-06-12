SUMMARY = "LaTeX PDF management testphase bundle"
DESCRIPTION = "This is a temporary package, which is used during a test phase \
to load the new PDF management code of LaTeX. The new PDF \
management code offers backend-independent interfaces to \
central PDF dictionaries, tools to create annotations, form \
Xobjects, to embed files, and to handle PDF standards. The code \
is provided, during a testphase, as an independent package to \
allow users and package authors to safely test the code. At a \
later stage it will be integrated into the LaTeX kernel (or in \
parts into permanent support packages), and the current \
testphase bundle will be removed."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.95xsvn66532"

RPM_NAME = "texlive-pdfmanagement-testphase-2023.201.0.0.95xsvn66532-51.1.noarch.rpm"
RPM_HASH = "c8dfe71308518b89a72dead1fbb3f4b8f3fb1acb9fa84b1429f32fda20a7dbf85f4c6cfaa28bae9af89f563a301f47fe34a4d9e8f69bf48ca00910120fe95995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(color-ltx.sty) \
tex(colorspace-patches-tmp-ltx.sty) \
tex(hgeneric-testphase.def) \
tex(hyperref-colorschemes.def) \
tex(l3backend-testphase-dvipdfmx.def) \
tex(l3backend-testphase-dvips.def) \
tex(l3backend-testphase-dvisvgm.def) \
tex(l3backend-testphase-luatex.def) \
tex(l3backend-testphase-pdftex.def) \
tex(l3backend-testphase-xetex.def) \
tex(l3pdffield-testphase.sty) \
tex(l3ref-tmp.sty) \
tex(output-patches-tmp-ltx.sty) \
tex(pdfmanagement-firstaid.sty) \
tex(pdfmanagement-testphase.sty) \
tex(xcolor-patches-tmp-ltx.sty) \
texlive-pdfmanagement-testphase"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(bookmark.sty) \
tex(etoolbox.sty) \
tex(l3draw.sty) \
tex(tagpdf-base.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm

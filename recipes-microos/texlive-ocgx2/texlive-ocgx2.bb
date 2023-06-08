SUMMARY = "Drop-in replacement for 'ocgx' and 'ocg-p'"
DESCRIPTION = "This package serves as a drop-in replacement for the packages \
ocgx by Paul Gaborit and ocg-p by Werner Moshammer for the \
creation of PDF Layers. It re-implements the functionality of \
the ocg, ocgx, and ocg-p packages and adds support for all \
known engines and back-ends including: LaTeX - dvips - \
ps2pdf/Distiller (Xe)LaTeX(x) - dvipdfmx pdfLaTeX and LuaLaTeX \
. It also ensures compatibility with the media9 and animate \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.56svn65292"

RPM_NAME = "texlive-ocgx2-2023.201.0.0.56svn65292-54.1.noarch.rpm"
RPM_HASH = "48af122024433f1b570cf4797f153b1300d186a9cc5c8552bafcdf995427bc51452267d9bcd8858bff40ba157e8ba4c3b4eaec02fb636b1968f8a0266ee609a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fixocgx.sty) tex(ocgbase.sty) tex(ocgx2.sty) texlive-ocgx2"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(ocgx.sty) tex(pdfbase.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

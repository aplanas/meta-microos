SUMMARY = "Generate Japanese-style crop marks"
DESCRIPTION = "This bundle provides a LaTeX package for generating \
Japanese-style crop marks (called 'tombow' in Japanese) for \
practical use in self-publishing. The bundle contains the \
following packages: gentombow.sty: Generate crop marks (called \
'tombow' in Japanese) for practical use in self-publishing. It \
provides the core 'tombow' feature if not available. \
pxgentombow.sty: Superseded by gentombow.sty; kept for \
compatibility only. bounddvi.sty: Set papersize special to DVI \
file. Can be used on LaTeX/pLaTeX/upLaTeX (with DVI output \
mode) with dvips or dvipdfmx drivers."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn64333"

RPM_NAME = "texlive-gentombow-2023.201.svn64333-52.1.noarch.rpm"
RPM_HASH = "486314867af4fccf8a993bca6893a6e46636006f6873c841316ec95f3801df7d6c314081985b71baa49ac1298cb9279d1e423783af9f9e8b4cd13154f33dca35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bounddvi.sty) tex(gentombow.sty) tex(pxesopic.sty) tex(pxgentombow.sty) tex(pxpdfpages.sty) tex(pxtextpos.sty) texlive-gentombow"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(atbegshi.sty) tex(eso-pic.sty) tex(etoolbox.sty) tex(filehook.sty) tex(pdfpages.sty) tex(pxatbegshi.sty) tex(pxeveryshi.sty) tex(textpos.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

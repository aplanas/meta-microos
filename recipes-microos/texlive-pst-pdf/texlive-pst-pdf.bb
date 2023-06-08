SUMMARY = "Make PDF versions of graphics by processing between runs"
DESCRIPTION = "The package pst-pdf simplifies the use of graphics from \
PSTricks and other PostScript code in PDF documents. As in \
building a bibliography with BibTeX, additional external \
programmes are invoked. In this case they are used to create a \
PDF file (\\PDFcontainer) that will contain all the graphics \
material. In the final document these contents will be inserted \
instead of the original PostScript code. The package works with \
pstricks and requires a recent version of the preview package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2fsvn56622"

RPM_NAME = "texlive-pst-pdf-2023.201.1.2fsvn56622-53.1.noarch.rpm"
RPM_HASH = "898578e8b0057c3f62dffebbcdd329ca28f861544e7ab823a56c6ceb2b77519f81b2737dafaa90d7598ca48ec493d489ab1a3152fc3a0a2c2a073772e033b888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-pdf.sty) texlive-pst-pdf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(environ.sty) tex(graphicx.sty) tex(ifpdf.sty) tex(ifvtex.sty) tex(ifxetex.sty) tex(luatex85.sty) tex(preview.sty) tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-pst-pdf-bin texlive-scripts texlive-scripts-bin"

inherit rpm

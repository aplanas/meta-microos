SUMMARY = "Book publishing scheme (core LaTeX and add-ons)"
DESCRIPTION = "This is a book publishing scheme, containing core (Lua)LaTeX \
and selected additional packages likely to be useful for \
non-technical book publication. It does not contain additional \
fonts (different books need different fonts, and the packages \
are large), nor does it contain additional mathematical or \
other technical packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63547"

RPM_NAME = "texlive-scheme-bookpub-2023.201.svn63547-56.1.noarch.rpm"
RPM_HASH = "964a18fcec335af6dd42a342b7a6a4846a2c73c57608549011d548a3394ed0ffed2795ba19a5e59e86dfb7157199ee9cf25b975dacdd8665820ea76d6be01aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-bookpub"
RDEPENDS:${PN} += "texlive-barcodes texlive-biber texlive-biblatex texlive-bookcover texlive-caption texlive-collection-basic texlive-collection-latex texlive-enumitem texlive-fontspec texlive-latexmk texlive-lipsum texlive-listings texlive-markdown texlive-memoir texlive-microtype texlive-minted texlive-novel texlive-octavo texlive-pdfpages texlive-pgf texlive-qrcode texlive-shapes texlive-titlesec texlive-tocloft texlive-tufte-latex texlive-willowtreebook"

inherit rpm

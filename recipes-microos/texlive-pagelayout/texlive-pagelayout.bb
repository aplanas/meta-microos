SUMMARY = "Layout graphic rich documents"
DESCRIPTION = "The pagelayout class enables you to layout pages declaratively \
using simple macros for pages, covers, grids, templates, text, \
and graphics to create graphic rich, perfectly typeset, and \
print ready PDFs. The integration of Inkscape allows your to \
create box shadows. The integration of ImageMagick allows you \
to configure compression and sharpening for bitmap graphics to \
export web, print or preview versions of your document. \
Parallelized image optimization, caching, and a draft mode \
enable fast PDF creation and a responsive workflow, even for \
large documents with lots of photos and graphics. The \
pagelayout class also integrates the Pgf/TikZ and tcolorbox \
LaTeX packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.4svn66392"

RPM_NAME = "texlive-pagelayout-2023.201.1.0.4svn66392-51.1.noarch.rpm"
RPM_HASH = "971bb012965ae804a3f4d805bf1d7f7ec4049727dcce1ddc74ce8bed27947a00b252bb1a36df57ddf3998eedce90030c7280409d3ef76299e6e4e6bf2f9d9fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pagelayout.cls) texlive-pagelayout"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pgfopts.sty) tex(standalone.cls) tex(tcolorbox.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-pagelayout-bin texlive-scripts texlive-scripts-bin"

inherit rpm

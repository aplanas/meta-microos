SUMMARY = "Tools for the documentation of LaTeX code"
DESCRIPTION = "The package provides a collection of tools for use either in an \
'ordinary' LaTeX document, or within a .dtx file."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn34474"

RPM_NAME = "texlive-doctools-2023.201.0.0.1svn34474-52.1.noarch.rpm"
RPM_HASH = "efb43229ad3b6f4cc07da64085c9aceb68fc91e82f5a851cb10a8275030a151149f68abd1f8a11a1934927bc6965735ad6d54f2776179cadacf597e24e016ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(doctools.sty) texlive-doctools"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(bookmark.sty) tex(cmap.sty) tex(etoolbox.sty) tex(fontenc.sty) tex(kvoptions-patch.sty) tex(kvoptions.sty) tex(kvsetkeys.sty) tex(listings.sty) tex(pdftexcmds.sty) tex(textcomp.sty) tex(url.sty) tex(xcolor.sty) tex(xspace.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

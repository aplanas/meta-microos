SUMMARY = "Enclose the document body with some pieces of code"
DESCRIPTION = "The package enables authors to designate in the preamble to \
make the document body enclosed with the given pieces of code. \
As is known, there are already various mechanisms provided by \
LaTeX kernel or packages that attach hooks at the beginning and \
end of documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn40213"

RPM_NAME = "texlive-bxenclose-2023.201.0.0.2svn40213-52.1.noarch.rpm"
RPM_HASH = "5958bfc9617e7d81b8d4689c714070060886fcc6267a637dc253cef41c44933b5142b1c5a9c85177ca12d7d7150bfac3e7932ed298e617ee73a6f597dec011d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxenclose.sty) texlive-bxenclose"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

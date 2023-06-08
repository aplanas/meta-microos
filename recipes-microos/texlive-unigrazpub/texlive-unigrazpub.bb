SUMMARY = "LaTeX templates for University of Graz Library Publishing Services"
DESCRIPTION = "This package provides a LaTeX class matching the preparation \
guidelines of the Library Publishing Services of University of \
Graz. The bundle also includes a comprehensive set of example \
files for books and collections."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn64797"

RPM_NAME = "texlive-unigrazpub-2023.201.1.00svn64797-53.1.noarch.rpm"
RPM_HASH = "feb777306f1892cbb9e6263053589d159acd2fa658b3b14288ae79e8177d5bd528191740df60cf8eaa8b12cd7ec31028b1b05803b38ece3baec80eea5fc61029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unigrazpub.cls) texlive-unigrazpub"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(anyfontsize.sty) tex(biblatex-chicago.sty) tex(csquotes.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(l3keys2e.sty) tex(ragged2e.sty) tex(roboto.sty) tex(scrbook.cls) tex(scrlayer-scrpage.sty) tex(sourceserifpro.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

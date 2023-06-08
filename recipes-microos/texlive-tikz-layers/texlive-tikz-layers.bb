SUMMARY = "TikZ provides graphical layers on TikZ: 'behind', 'above' and 'glass'"
DESCRIPTION = "TikZ-layers is a tiny package that provides, along side \
'background', typical graphical layers on TikZ: 'behind', \
'above' and 'glass'. The layers may be selected with one of the \
styles 'on behind layer', 'on above layer', 'on glass layer' as \
an option to a {scope} environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn46660"

RPM_NAME = "texlive-tikz-layers-2023.201.0.0.9svn46660-52.1.noarch.rpm"
RPM_HASH = "f677426f5dd0e33a7e7b5f344652c07b059fd398dd8b2408570ad9e6f853af1262b489c323aaf87db2ce7202315be13e057ecb9398ca5bf9df9366b4e7c05bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-layers.sty) texlive-tikz-layers"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

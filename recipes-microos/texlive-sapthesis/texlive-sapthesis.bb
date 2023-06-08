SUMMARY = "Typeset theses for Sapienza-University, Rome"
DESCRIPTION = "The class will typeset Ph.D., Master, and Bachelor theses that \
adhere to the publishing guidelines of the Sapienza University \
of Rome."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.1svn63810"

RPM_NAME = "texlive-sapthesis-2023.201.5.1svn63810-53.1.noarch.rpm"
RPM_HASH = "7e238cd768d5a4ed907885224293711cbb1f18568888f9a86eee3753bf69b5a3b82a1465d3c7c028750c8d3f69f09b8bbdb5e89db12cdad6064bd9e1f7f54ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sapthesis.cls) texlive-sapthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(book.cls) tex(booktabs.sty) tex(caption.sty) tex(color.sty) tex(etoolbox.sty) tex(fancyhdr.sty) tex(fontenc.sty) tex(fontspec.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(ifxetex.sty) tex(lmodern.sty) tex(textcomp.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

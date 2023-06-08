SUMMARY = "Simple CD, DVD covers for printing"
DESCRIPTION = "The package provides printable cut-outs for various CD, DVD and \
other disc holders. The name of the package comes from its \
implementation and ease of use; it was designed just for text \
content, but since the text is placed in a \\parbox in a tabular \
environment cell, a rather wide range of things may be placed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn29260"

RPM_NAME = "texlive-simplecd-2023.201.1.4svn29260-53.1.noarch.rpm"
RPM_HASH = "a69490a758d7eac3846086fee996120830dcc0b9e570a254b64482b0f861e3c84e9a35371289099d30178f5cbb8d6776701d33041b56da79a866addd1d4f0433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(simplecd.sty) texlive-simplecd"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(fix-cm.sty) tex(graphicx.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

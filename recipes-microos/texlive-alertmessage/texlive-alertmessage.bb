SUMMARY = "Alert messages for LaTeX"
DESCRIPTION = "Some macros to display alert messages (informations, errors, \
warnings and success messages)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn38055"

RPM_NAME = "texlive-alertmessage-2023.201.1.1svn38055-54.1.noarch.rpm"
RPM_HASH = "7eb458519c02e94915bc179c27bd9abebfc03356250bdec894cd31ef0795bf51ca40944bd0d066cbeb2053f3cf0bb4d484824982446cb03c2eec354532895642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(alertmessage.sty) texlive-alertmessage"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(graphicx.sty) tex(ifthen.sty) tex(picture.sty) tex(tikz.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

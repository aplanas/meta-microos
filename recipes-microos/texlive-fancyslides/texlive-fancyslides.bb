SUMMARY = "Custom presentation class built upon LaTeX Beamer"
DESCRIPTION = "This class is prepared for short presentations with a modern \
look & feel. It offers the following features: custom \
background for each slide, predefined types of slides, \
simplified commands (e.g. for starting and ending slide). The \
class is built upon LaTeX beamer, so all beamer commands should \
work."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36263"

RPM_NAME = "texlive-fancyslides-2023.201.1.0svn36263-52.1.noarch.rpm"
RPM_HASH = "327599b7959b84ecf278a637bcf3fcf68169df236cf56a72cfa7a9eb3bb8a76f7072c5da31e8d9cb695ffd64fb37ea01071dac708f37711f668c078abd3f1235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fancyslides.cls) texlive-fancyslides"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(framed.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

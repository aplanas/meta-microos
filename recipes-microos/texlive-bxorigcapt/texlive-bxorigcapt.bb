SUMMARY = "To retain the original caption names when using Babel"
DESCRIPTION = "This package forces the caption names (\\chaptername, \\today, \
etc) declared by the document class in use to be used as the \
caption names for a specific language introduced by the Babel \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64072"

RPM_NAME = "texlive-bxorigcapt-2023.201.1.0svn64072-52.1.noarch.rpm"
RPM_HASH = "0433fdbfb6eacc185e7fdb3cf280172972284dd3382ba5f858381aeb667fe3e6e07334935a2cf4f4c45d9f44aac170386bef246e2c879b0c89bcbf99eb2eb4aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxorigcapt.sty) texlive-bxorigcapt"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

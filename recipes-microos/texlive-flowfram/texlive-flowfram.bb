SUMMARY = "Create text frames for posters, brochures or magazines"
DESCRIPTION = "The flowfram package enables you to create frames in a document \
such that the contents of the document environment flow from \
one frame to the next in the order in which they were defined. \
This is useful for creating posters or magazines, indeed any \
form of document that does not conform to the standard one or \
two column layout."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.17svn35291"

RPM_NAME = "texlive-flowfram-2023.201.1.17svn35291-52.1.noarch.rpm"
RPM_HASH = "0cc33e37c1032d8cc61cd5c5e408ed9cdc8328fdf7ec63bfc9a890963a610e637cd81680b5cb9ff47c26bcd486adfcd07f8dc9a426b952f030c43956f0cc9abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(flowfram.sty) texlive-flowfram"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep sed tex(afterpage.sty) tex(color.sty) tex(etoolbox.sty) tex(graphics.sty) tex(ifthen.sty) tex(xfor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

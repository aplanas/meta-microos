SUMMARY = "Provides support for many indexes"
DESCRIPTION = "This package provides support for many indexes, leaving all the \
bookkeeping to LaTeX and makeindex. No extra programs or files \
are needed. One runs latex and makeindex as if there is just \
one index. In the main file one puts commands like \
\\setindex{main} to steer the flow. Some features of makeindex \
may no longer work."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49874"

RPM_NAME = "texlive-manyind-2023.201.svn49874-52.1.noarch.rpm"
RPM_HASH = "a872c86db3583367897ff6c05b0b4373876056a5f568c0cf84ec2dc2821864307649ebc2244919f7b3d57915d3bd905ea13c27077088d8748fdfffc7808cccf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(manyind.sty) texlive-manyind"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(makeidx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

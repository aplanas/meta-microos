SUMMARY = "Key based parser"
DESCRIPTION = "This LaTeX package provides an interface to define and evaluate \
key-based replacement rules. It can be used to parse the \
argument specification of a document command."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn60277"

RPM_NAME = "texlive-keyparse-2023.201.1.1svn60277-55.1.noarch.rpm"
RPM_HASH = "4111fde8f19b4c8dc100fc03f4b41527904292e98f4ba5885f4c0749f93d0e9514b5e348cb7cfc3c2d575c453c99a5fcf147b170ba870daecd2b47b9f3a44d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(keyparse.sty) texlive-keyparse"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(l3keys2e.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

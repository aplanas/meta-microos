SUMMARY = "A suite of tools for typesetting algorithms in pseudo-code"
DESCRIPTION = "Consists of two environments: algorithm and algorithmic. The \
algorithm package defines a floating algorithm environment \
designed to work with the algorithmic style. Within an \
algorithmic environment a number of commands for typesetting \
popular algorithmic constructs are available."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.0.0.1svn42428"

RPM_NAME = "texlive-algorithms-2023.201.0.0.1svn42428-54.1.noarch.rpm"
RPM_HASH = "ddad3e63c0e3370fd71e6ca509536c2cf1126710ddedf154bc75a90930f2175944bdef88130fd9126e808b2c05e3093e1b4452b6bb0ae5c4ed30afbfa30d5677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(algorithm.sty) tex(algorithmic.sty) texlive-algorithms"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(float.sty) tex(ifthen.sty) tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

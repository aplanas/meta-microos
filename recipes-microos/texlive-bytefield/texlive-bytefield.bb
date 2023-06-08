SUMMARY = "Create illustrations for network protocol specifications"
DESCRIPTION = "The bytefield package helps the user create illustrations for \
network protocol specifications and anything else that utilizes \
fields of data. These illustrations show how the bits and bytes \
are laid out in a packet or in memory."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn60265"

RPM_NAME = "texlive-bytefield-2023.201.2.7svn60265-52.1.noarch.rpm"
RPM_HASH = "b7456ad4505b335d805763c3f53020d2f19c85f5816c64f3d640ac630bc183369f558d83e45abe1bf413d9548e6203bee1066827b35cb500a7fddbf6106e05c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bytefield.sty) texlive-bytefield"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

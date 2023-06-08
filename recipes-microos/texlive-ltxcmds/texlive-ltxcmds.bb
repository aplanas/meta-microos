SUMMARY = "Some LaTeX kernel commands for general use"
DESCRIPTION = "This package exports some utility macros from the LaTeX kernel \
into a separate namespace and also makes them available for \
other formats such as plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.25svn56421"

RPM_NAME = "texlive-ltxcmds-2023.201.1.25svn56421-52.1.noarch.rpm"
RPM_HASH = "85ec31ca450519f8be7aa602f956f61b78c170c998bf4c826b84ed0305b9ff332707e9331b7b6ef6f3e90d799dffcfaa1f279cecd20a41407106424f6f9d2679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ltxcmds.sty) texlive-ltxcmds"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm

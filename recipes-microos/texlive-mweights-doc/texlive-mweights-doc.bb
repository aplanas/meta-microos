SUMMARY = "Documentation for texlive-mweights"
DESCRIPTION = "This package includes the documentation for texlive-mweights"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53520"

RPM_NAME = "texlive-mweights-doc-2023.201.svn53520-54.1.noarch.rpm"
RPM_HASH = "f795b60cec06dc8515cd09b19475907c963ae2229fc7225c70c54be692eb6749efc81ee31e621e58caab2da97e4ecd987f62284494402d8ce6188a1c770b7359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mweights-doc"
RDEPENDS:${PN} += ""

inherit rpm

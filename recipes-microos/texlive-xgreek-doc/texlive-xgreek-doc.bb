SUMMARY = "Documentation for texlive-xgreek"
DESCRIPTION = "This package includes the documentation for texlive-xgreek"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.0svn64300"

RPM_NAME = "texlive-xgreek-doc-2023.201.3.2.0svn64300-52.1.noarch.rpm"
RPM_HASH = "5217038f9a08f40274707695f3ec0df83e786e634e3d80d57049f5e8500d16fa88abdd467ccbe67b97e3f97bc17a2a5da5149344db04dcfc081102abdde74a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xgreek-doc"
RDEPENDS:${PN} += ""

inherit rpm

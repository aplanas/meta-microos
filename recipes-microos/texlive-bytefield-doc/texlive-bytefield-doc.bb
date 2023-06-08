SUMMARY = "Documentation for texlive-bytefield"
DESCRIPTION = "This package includes the documentation for texlive-bytefield"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn60265"

RPM_NAME = "texlive-bytefield-doc-2023.201.2.7svn60265-52.1.noarch.rpm"
RPM_HASH = "d85082e9cea211d6f441347490539516a61723c97f83fcf31a3487f4047dd46372a6b498228106dc1e99f5b5cd4398c5d4c8ce9e9da5b0b46eb41fa6d732c2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bytefield-doc"
RDEPENDS:${PN} += ""

inherit rpm

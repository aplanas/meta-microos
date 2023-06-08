SUMMARY = "Documentation for texlive-mslapa"
DESCRIPTION = "This package includes the documentation for texlive-mslapa"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-mslapa-doc-2023.201.svn54080-54.1.noarch.rpm"
RPM_HASH = "c0e9d1bc9778e9dcb83b9872290b61185c5e640a67038365b70bcbb196300fb7b252ec31d8d8da2f4a5728b3cdd1e75d079afa869e06ac86a2d6eee56707c9e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mslapa-doc"
RDEPENDS:${PN} += ""

inherit rpm

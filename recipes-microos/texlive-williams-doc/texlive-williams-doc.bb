SUMMARY = "Documentation for texlive-williams"
DESCRIPTION = "This package includes the documentation for texlive-williams"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-williams-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "bbde20c5975b564fa845604f9c2d15543f880827d80bbc0dee80d8f844b6165fe906ceb54b4be78383c7cd9a64cf029b1f73ad4b915027b05dbf65db56784d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-williams-doc"
RDEPENDS:${PN} += ""

inherit rpm

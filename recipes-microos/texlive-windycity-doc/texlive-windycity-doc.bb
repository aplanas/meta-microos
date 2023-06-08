SUMMARY = "Documentation for texlive-windycity"
DESCRIPTION = "This package includes the documentation for texlive-windycity"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61223"

RPM_NAME = "texlive-windycity-doc-2023.201.svn61223-53.1.noarch.rpm"
RPM_HASH = "d801ad3c2a74a1dee48fcbef0aa76b1a95ad13cb0b132e6924c8b1ff8ee461342ab5b20b72cceead8c57c13b988deb94e48a582ab743246adf1a2f4b0dc73f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-windycity-doc"
RDEPENDS:${PN} += ""

inherit rpm

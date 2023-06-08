SUMMARY = "Documentation for texlive-bangtex"
DESCRIPTION = "This package includes the documentation for texlive-bangtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55475"

RPM_NAME = "texlive-bangtex-doc-2023.201.svn55475-53.1.noarch.rpm"
RPM_HASH = "1be2b30938a0910fa3ca9baf6d6d94398dad6e2d5553d2f27d5c8423223fac63fa742d97a32b51706c3ed9204237d6c06ff2bfb1a4866027eb3c9becb42ccaf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangtex-doc"
RDEPENDS:${PN} += ""

inherit rpm

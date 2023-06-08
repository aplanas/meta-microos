SUMMARY = "Documentation for texlive-revtex4"
DESCRIPTION = "This package includes the documentation for texlive-revtex4"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0asvn56589"

RPM_NAME = "texlive-revtex4-doc-2023.201.4.0asvn56589-53.1.noarch.rpm"
RPM_HASH = "cbb0d225acc8c524d1354785d02deaee217774a751322e161b8a9eb72a902c17926b05e3aca08926b0c93e2e0a51c64df82a97a911befbe2e0fe650b1d24ac8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex4-doc"
RDEPENDS:${PN} += ""

inherit rpm

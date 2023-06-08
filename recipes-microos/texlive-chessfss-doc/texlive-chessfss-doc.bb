SUMMARY = "Documentation for texlive-chessfss"
DESCRIPTION = "This package includes the documentation for texlive-chessfss"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn19440"

RPM_NAME = "texlive-chessfss-doc-2023.201.1.2asvn19440-53.1.noarch.rpm"
RPM_HASH = "ae9c9f0846a03a65da2f402716657f5fd0e6718c547f0cb6ac20650d1b4dd23213af6681580c07ba32f76a96df56a46e7a4a8603f0a3459e708b321257023530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chessfss-doc"
RDEPENDS:${PN} += ""

inherit rpm

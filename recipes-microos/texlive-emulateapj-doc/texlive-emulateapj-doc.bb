SUMMARY = "Documentation for texlive-emulateapj"
DESCRIPTION = "This package includes the documentation for texlive-emulateapj"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28469"

RPM_NAME = "texlive-emulateapj-doc-2023.201.svn28469-53.1.noarch.rpm"
RPM_HASH = "49475573fa26ef1d9b83f19c9e0b73958e9140b0574f664dc9e16c960d5a67b518d493c9d796ee8a7a50088d0e7c3217f98e2c058605b0aa833df57897bb5faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emulateapj-doc"
RDEPENDS:${PN} += ""

inherit rpm

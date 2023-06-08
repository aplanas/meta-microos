SUMMARY = "Documentation for texlive-babel-scottish"
DESCRIPTION = "This package includes the documentation for texlive-babel-scottish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0gsvn30289"

RPM_NAME = "texlive-babel-scottish-doc-2023.201.1.0gsvn30289-53.1.noarch.rpm"
RPM_HASH = "5aeeb1556fa977f91fe51c3eac5e5360a7e7cb59ef90146cde69a0c5612decbd5e6d65ae0239738ab100e0c84fbc52a54a12be11fe2d1ecdd85743948de22bf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-scottish-doc"
RDEPENDS:${PN} += ""

inherit rpm

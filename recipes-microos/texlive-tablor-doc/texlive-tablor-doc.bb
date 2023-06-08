SUMMARY = "Documentation for texlive-tablor"
DESCRIPTION = "This package includes the documentation for texlive-tablor"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.07_gsvn31855"

RPM_NAME = "texlive-tablor-doc-2023.201.4.07_gsvn31855-54.1.noarch.rpm"
RPM_HASH = "0ad882d279a9b2cdf2ecc3c42a43f4d7ef4828e7febcdb0e17f859d897b4dd4b3274a6e6fc40acd1d8738d32c0ed749fc94aecf351c1d70ba18a20d946f0243a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tablor-doc:en;fr) texlive-tablor-doc"
RDEPENDS:${PN} += ""

inherit rpm

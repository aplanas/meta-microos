SUMMARY = "Documentation for texlive-atveryend"
DESCRIPTION = "This package includes the documentation for texlive-atveryend"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11svn53108"

RPM_NAME = "texlive-atveryend-doc-2023.201.1.11svn53108-53.1.noarch.rpm"
RPM_HASH = "2cb36ccb12cd322c59e822c4cf9a2884b72e54dde08b065063c2d8ba29b83ab0624365bf68f0adb23280b09fd0cabbda8b44f9ea2b78898e50bca859336b362d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atveryend-doc"
RDEPENDS:${PN} += ""

inherit rpm

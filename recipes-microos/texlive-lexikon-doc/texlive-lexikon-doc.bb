SUMMARY = "Documentation for texlive-lexikon"
DESCRIPTION = "This package includes the documentation for texlive-lexikon"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn17364"

RPM_NAME = "texlive-lexikon-doc-2023.201.1.0csvn17364-54.1.noarch.rpm"
RPM_HASH = "cf18564ca0c6e635ab78b92be98a1f045181b94c414be6292b8651a5b202b4b9f3d612a3ef77d0b0552676bb7e14b185f6931d25e08766022e67a983f006eca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lexikon-doc"
RDEPENDS:${PN} += ""

inherit rpm

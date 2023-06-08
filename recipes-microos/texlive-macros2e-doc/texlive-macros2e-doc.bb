SUMMARY = "Documentation for texlive-macros2e"
DESCRIPTION = "This package includes the documentation for texlive-macros2e"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4asvn64967"

RPM_NAME = "texlive-macros2e-doc-2023.201.0.0.4asvn64967-52.1.noarch.rpm"
RPM_HASH = "aa0eb6532c9dbf8c483cf80216aed6c381ff67f48cb5ec4274a7b42b0f1c4fdaad0ab1863a4f70b043c0d82b33fb25e5368395482b7471f2fb214e42ac28a2ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-macros2e-doc"
RDEPENDS:${PN} += ""

inherit rpm

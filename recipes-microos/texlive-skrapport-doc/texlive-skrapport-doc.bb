SUMMARY = "Documentation for texlive-skrapport"
DESCRIPTION = "This package includes the documentation for texlive-skrapport"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12ksvn52412"

RPM_NAME = "texlive-skrapport-doc-2023.201.0.0.12ksvn52412-57.1.noarch.rpm"
RPM_HASH = "c5f3f6222a53ddb0e352506980774407fa588a79f474ed4e291ffc12d666c1085bf218a639f192569ba2f46ff29b6a3aae38f9f8f2dc9c502ea23627a1485264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skrapport-doc"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-embrac"
DESCRIPTION = "This package includes the documentation for texlive-embrac"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9asvn57814"

RPM_NAME = "texlive-embrac-doc-2023.201.0.0.9asvn57814-53.1.noarch.rpm"
RPM_HASH = "4f28ba6af182096f4394a61205282edc8c605e51226c096c04421b3912a06e3c7dbf48827025b8dbdaef6f0d0fe9d94aa90d2e438a6ccf8688e922fcf06fae1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embrac-doc"
RDEPENDS:${PN} += ""

inherit rpm

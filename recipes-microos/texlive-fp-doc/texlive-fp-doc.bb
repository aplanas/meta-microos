SUMMARY = "Documentation for texlive-fp"
DESCRIPTION = "This package includes the documentation for texlive-fp"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1dsvn49719"

RPM_NAME = "texlive-fp-doc-2023.201.2.1dsvn49719-52.1.noarch.rpm"
RPM_HASH = "15c3201fa44782eed380dfdd97f74cc210874ce8fd4617fc93bb9cdac38ee318cdc7c3c16c11692107ec5efa97043c157e55af3a9996ec85e911b4f380cdcf2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fp-doc"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Binary files of yplan"
DESCRIPTION = "Binary files of yplan"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34398"

RPM_NAME = "texlive-yplan-bin-2023.20230311.svn34398-89.1.aarch64.rpm"
RPM_HASH = "c7ebd625f06fb4c9e5798a402fbe11237a7e5690bc4bc1fb287df9712fb1e25f04ae2a7b353378370d080f60683a4a244493f6694c894262eac3aab2dbf22622"

RPROVIDES:${PN} += "texlive-yplan-bin texlive-yplan-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-yplan"

inherit rpm

SUMMARY = "Documentation for texlive-rccol"
DESCRIPTION = "This package includes the documentation for texlive-rccol"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2csvn15878"

RPM_NAME = "texlive-rccol-doc-2023.201.1.2csvn15878-53.1.noarch.rpm"
RPM_HASH = "cc914dc3011112c5fa082aa1d541f4d0b9c450974baa5105eb4e769239461d56eeb28a27c636471dbd614f5a17646d1fe0834f07d52473193939f33968d31aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rccol-doc"
RDEPENDS:${PN} += ""

inherit rpm

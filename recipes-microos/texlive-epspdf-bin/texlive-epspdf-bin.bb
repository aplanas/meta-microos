SUMMARY = "Binary files of epspdf"
DESCRIPTION = "Binary files of epspdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29050"

RPM_NAME = "texlive-epspdf-bin-2023.20230311.svn29050-91.1.aarch64.rpm"
RPM_HASH = "03f74ea89c423d35078a1a79d938580c3f590216afd7e2e36113558c8dd44dc1fcaa4e634e4b87684e8093899a8d16bcacf4dae78770a5e6e62bdae2e067e7bf"

RPROVIDES:${PN} += "texlive-epspdf-bin texlive-epspdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-epspdf"

inherit rpm

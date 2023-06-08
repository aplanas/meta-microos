SUMMARY = "Binary files of dtxgen"
DESCRIPTION = "Binary files of dtxgen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29031"

RPM_NAME = "texlive-dtxgen-bin-2023.20230311.svn29031-89.1.aarch64.rpm"
RPM_HASH = "064c964c97baf059a7b56f41b36da9ed77555510bd29580641a2446fc16d68a22cf8b6a62701c0fd351fd63a2c443dc3fcdc761a59730109f21ef00a57a84e5b"

RPROVIDES:${PN} += "texlive-dtxgen-bin texlive-dtxgen-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-dtxgen"

inherit rpm

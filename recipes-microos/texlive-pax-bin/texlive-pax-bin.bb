SUMMARY = "Binary files of pax"
DESCRIPTION = "Binary files of pax"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn10843"

RPM_NAME = "texlive-pax-bin-2023.20230311.svn10843-89.1.aarch64.rpm"
RPM_HASH = "180648d2a8d3039a2d97e0569d547692a24b95f7b186b976ed1bd76e1fcc658673de4fdfaa13d88b1502359b68368363130e28fef0a73800b2e782fd60aaa372"

RPROVIDES:${PN} += "texlive-pax-bin texlive-pax-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pax"

inherit rpm

SUMMARY = "Binary files of eplain"
DESCRIPTION = "Binary files of eplain"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-eplain-bin-2023.20230311.svn3006-89.1.aarch64.rpm"
RPM_HASH = "30b31414332ac4266eb24235ea70d3e8f1494ee099f17b599c03e0849bc44af1060d14ca13ed27cffed933a2026249595316093cc6481c19edbe30b6e877a069"

RPROVIDES:${PN} += "texlive-eplain-bin texlive-eplain-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-eplain"

inherit rpm

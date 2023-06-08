SUMMARY = "Binary files of xindex"
DESCRIPTION = "Binary files of xindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49312"

RPM_NAME = "texlive-xindex-bin-2023.20230311.svn49312-89.1.aarch64.rpm"
RPM_HASH = "30645366d8c0f5d01fa1319eb6673658c10b9b6609e4273d9067e5f4200a8e8bd3bd84c20a10c13caf5857bb89242a45bb207a3871f1581dc6c1e9ab956c5123"

RPROVIDES:${PN} += "texlive-xindex-bin texlive-xindex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-xindex"

inherit rpm

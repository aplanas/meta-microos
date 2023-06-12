SUMMARY = "Binary files of a2ping"
DESCRIPTION = "Binary files of a2ping"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn27321"

RPM_NAME = "texlive-a2ping-bin-2023.20230311.svn27321-91.1.aarch64.rpm"
RPM_HASH = "8a1e853ee7167550180b8db52c8fd51baa5739c6df9014b6b50ebcd867370a4ee91a38fa809318e522a3b2e3da53f4461df0f32eae914e1666cc0c05ded2f0d6"

RPROVIDES:${PN} += "texlive-a2ping-bin texlive-a2ping-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-a2ping"

inherit rpm

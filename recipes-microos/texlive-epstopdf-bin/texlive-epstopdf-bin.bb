SUMMARY = "Binary files of epstopdf"
DESCRIPTION = "Binary files of epstopdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18336"

RPM_NAME = "texlive-epstopdf-bin-2023.20230311.svn18336-89.1.aarch64.rpm"
RPM_HASH = "d5c97f9bba25d0a99a21c6ddd8957a2b1983dc1780d31e45d4b18c5554ee04dfebaa077b8a2188fc12a75877b3c99f8b648fda9611f5f8b17e80665b684092ce"

RPROVIDES:${PN} += "texlive-epstopdf-bin texlive-epstopdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-epstopdf"

inherit rpm

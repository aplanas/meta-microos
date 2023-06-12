SUMMARY = "Binary files of pdfxup"
DESCRIPTION = "Binary files of pdfxup"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn40690"

RPM_NAME = "texlive-pdfxup-bin-2023.20230311.svn40690-91.1.aarch64.rpm"
RPM_HASH = "8605c0553ccbc4eecc8e9970a3142908f02ad666b1f007019f62ea00f00bcd87205685f8b20d9e23295570963bafc9f058f2a8a862f0a14286e264716de9af1d"

RPROVIDES:${PN} += "texlive-pdfxup-bin texlive-pdfxup-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pdfxup"

inherit rpm

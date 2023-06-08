SUMMARY = "Binary files of pdfbook2"
DESCRIPTION = "Binary files of pdfbook2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37537"

RPM_NAME = "texlive-pdfbook2-bin-2023.20230311.svn37537-89.1.aarch64.rpm"
RPM_HASH = "bd1c69ea44e0967490a2410446785e9c5de4ccd4d6be00ec1b00dfdae39030907341cdb0adf0e870e8c493dd533d3914f6e6c97d34dba1d4d4576db423a821ec"

RPROVIDES:${PN} += "texlive-pdfbook2-bin texlive-pdfbook2-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pdfbook2"

inherit rpm

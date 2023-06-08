SUMMARY = "Binary files of pdfxup"
DESCRIPTION = "Binary files of pdfxup"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn40690"

RPM_NAME = "texlive-pdfxup-bin-2023.20230311.svn40690-89.1.aarch64.rpm"
RPM_HASH = "e81cf8161732f2d30d50c0e70493c38feef2a73479b37f1ea5a463fdd17a1f465a78ca8cbd32f854c08fdb6f1396f0cd31c8219f22d5e9c84f7f32f83773d572"

RPROVIDES:${PN} += "texlive-pdfxup-bin texlive-pdfxup-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pdfxup"

inherit rpm

SUMMARY = "Binary files of pst2pdf"
DESCRIPTION = "Binary files of pst2pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29333"

RPM_NAME = "texlive-pst2pdf-bin-2023.20230311.svn29333-89.1.aarch64.rpm"
RPM_HASH = "9ca8d0534a214dd75ef12b23e82470b0c68df42293522dc1caaa97b621242d8e0e5d744364afacd7041d6f42244590839b5129236a8b57efdde636a32e7bc22b"

RPROVIDES:${PN} += "texlive-pst2pdf-bin texlive-pst2pdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pst2pdf"

inherit rpm

SUMMARY = "Binary files of ketcindy"
DESCRIPTION = "Binary files of ketcindy"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49033"

RPM_NAME = "texlive-ketcindy-bin-2023.20230311.svn49033-89.1.aarch64.rpm"
RPM_HASH = "ff53ad15f5a4ce2fe8a181014028bc54ff07edca675da3ca5151d3c61227d9a66e206a733212adb7aea0f6adcb6d29c9ebe57a97542f89c95bef56c7ba13aa1b"

RPROVIDES:${PN} += "texlive-ketcindy-bin texlive-ketcindy-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ketcindy"

inherit rpm

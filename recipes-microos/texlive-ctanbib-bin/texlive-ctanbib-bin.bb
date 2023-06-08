SUMMARY = "Binary files of ctanbib"
DESCRIPTION = "Binary files of ctanbib"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn48478"

RPM_NAME = "texlive-ctanbib-bin-2023.20230311.svn48478-89.1.aarch64.rpm"
RPM_HASH = "04d54fed0ae4d69a60cf32ae0ca66bc2d9b49304a0e3e0fe8343325b8b3503c1b4661812a8aba9cbf36734e3c4f1b0eeeec1a28eb472cbe4d8de788dcc675bb1"

RPROVIDES:${PN} += "texlive-ctanbib-bin texlive-ctanbib-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ctanbib"

inherit rpm

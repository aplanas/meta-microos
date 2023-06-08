SUMMARY = "Binary files of ctanify"
DESCRIPTION = "Binary files of ctanify"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24061"

RPM_NAME = "texlive-ctanify-bin-2023.20230311.svn24061-89.1.aarch64.rpm"
RPM_HASH = "eaf820ee94cb8940d24eb50b9c32af894774d3f31d7e6cb730e2f53df0ea9960b773c99764aff56da42beb703c201b0cd39d8f599a1f117dd5ef1c97affdad11"

RPROVIDES:${PN} += "texlive-ctanify-bin texlive-ctanify-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ctanify"

inherit rpm

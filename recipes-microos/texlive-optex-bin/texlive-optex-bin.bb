SUMMARY = "Binary files of optex"
DESCRIPTION = "Binary files of optex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53804"

RPM_NAME = "texlive-optex-bin-2023.20230311.svn53804-91.1.aarch64.rpm"
RPM_HASH = "69974390610fb1b4b0e745b5f163dcae580a7f6ea4bfee2afac6f1c167d9fbbc8ed4979f46a551982892e45f3da4c02897f5b289418dff07491b39b0a568cc83"

RPROVIDES:${PN} += "texlive-optex-bin texlive-optex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-optex"

inherit rpm

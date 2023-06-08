SUMMARY = "Binary files of mkgrkindex"
DESCRIPTION = "Binary files of mkgrkindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14428"

RPM_NAME = "texlive-mkgrkindex-bin-2023.20230311.svn14428-89.1.aarch64.rpm"
RPM_HASH = "52255359859890e363b47e0b133f60eed845f28a9ee5a51a65cb6290fd1e7a28c3e2e700c91845f690fdbd334543daace27b1e7b251a7fdcc07081a1a1c2a9b9"

RPROVIDES:${PN} += "texlive-mkgrkindex-bin texlive-mkgrkindex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mkgrkindex"

inherit rpm

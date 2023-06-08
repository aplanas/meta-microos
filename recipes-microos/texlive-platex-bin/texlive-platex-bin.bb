SUMMARY = "Binary files of platex"
DESCRIPTION = "Binary files of platex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66079"

RPM_NAME = "texlive-platex-bin-2023.20230311.svn66079-89.1.aarch64.rpm"
RPM_HASH = "f8328630266a1c7563eb3490ef0d585a4b08ab182cd61536de912586fd58145bc4890a0c35736c443ad9a2581f47514c71271e64abead1efa51a235ace8cf672"

RPROVIDES:${PN} += "texlive-platex-bin texlive-platex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-platex"

inherit rpm

SUMMARY = "Binary files of pythontex"
DESCRIPTION = "Binary files of pythontex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn31638"

RPM_NAME = "texlive-pythontex-bin-2023.20230311.svn31638-91.1.aarch64.rpm"
RPM_HASH = "690745c4de5a7f3bf78240cd123aedd82dfd8134528ee75a516e0f971ef25d80415f9b4af570ae5f184589c96247ba717bd82c138324103ede3ec1a503aebac4"

RPROVIDES:${PN} += "texlive-pythontex-bin texlive-pythontex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pythontex"

inherit rpm

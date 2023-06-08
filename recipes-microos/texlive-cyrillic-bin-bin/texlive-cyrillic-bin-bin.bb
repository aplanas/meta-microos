SUMMARY = "Binary files of cyrillic-bin"
DESCRIPTION = "Binary files of cyrillic-bin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53554"

RPM_NAME = "texlive-cyrillic-bin-bin-2023.20230311.svn53554-89.1.aarch64.rpm"
RPM_HASH = "2f5aeff3cbcb2c2d8baa8a8199d3b55f04d81846f8ae49f4f74eaaa81d48b01d55272daca5becf29e9f13d5d4e0bf98ed5378e3ed4a0ad37e2bc627578a04684"

RPROVIDES:${PN} += "texlive-cyrillic-bin-bin texlive-cyrillic-bin-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-cyrillic-bin"

inherit rpm

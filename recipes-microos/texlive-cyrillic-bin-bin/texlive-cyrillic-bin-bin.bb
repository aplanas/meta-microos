SUMMARY = "Binary files of cyrillic-bin"
DESCRIPTION = "Binary files of cyrillic-bin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53554"

RPM_NAME = "texlive-cyrillic-bin-bin-2023.20230311.svn53554-91.1.aarch64.rpm"
RPM_HASH = "0ad1cba21569d5a55526d040c48bcfa9dc27a755c6f01b96272c96693e628b67224338e6a7682f663e2c9b835275f69f4a450e3ff7441b7b14e749659dd52fad"

RPROVIDES:${PN} += "texlive-cyrillic-bin-bin texlive-cyrillic-bin-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-cyrillic-bin"

inherit rpm

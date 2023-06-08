SUMMARY = "Binary files of latexindent"
DESCRIPTION = "Binary files of latexindent"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32150"

RPM_NAME = "texlive-latexindent-bin-2023.20230311.svn32150-89.1.aarch64.rpm"
RPM_HASH = "8ffe1bb2dab820b90a90e0aa0fe3470095032580c0128a36c162f5dd004599e2730594bc8373aca31c64e13d1748d497ee08acd1067ba952a4083f0a41eabca7"

RPROVIDES:${PN} += "texlive-latexindent-bin texlive-latexindent-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latexindent"

inherit rpm

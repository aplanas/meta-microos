SUMMARY = "Binary files of ltximg"
DESCRIPTION = "Binary files of ltximg"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32346"

RPM_NAME = "texlive-ltximg-bin-2023.20230311.svn32346-89.1.aarch64.rpm"
RPM_HASH = "b6e4b1bc62b35f42f07e0fd0502f743521304c2368316ce7f09a6e5b1cdd53ad56307967011411799325fc79eeebb5484429df561f69b296e06e7e45f3aebdcf"

RPROVIDES:${PN} += "texlive-ltximg-bin texlive-ltximg-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ltximg"

inherit rpm

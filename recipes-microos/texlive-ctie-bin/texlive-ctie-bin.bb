SUMMARY = "Binary files of ctie"
DESCRIPTION = "Binary files of ctie"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ctie-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "25f4e4a518273b2e6062820b781bb41bffec72dbff08c2231be59783181c0667596d6366593522422a7f341c7ebbf1e8eaf194f01a07309d14ce2d097e9c2ece"

RPROVIDES:${PN} += "texlive-ctie-bin texlive-ctie-bin(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-ctie"

inherit rpm

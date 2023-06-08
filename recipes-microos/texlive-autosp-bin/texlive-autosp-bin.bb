SUMMARY = "Binary files of autosp"
DESCRIPTION = "Binary files of autosp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-autosp-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "69b06160bae7431c7ef0531e3a9792164a6e5b04c547beb2072608b7fb30cf57df38a563a4c7f3abe056925af93dac4406d980b2b8b0544ad3121ca582bbb209"

RPROVIDES:${PN} += "texlive-autosp-bin texlive-autosp-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) texlive-autosp"

inherit rpm

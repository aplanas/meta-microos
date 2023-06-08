SUMMARY = "Binary files of patgen"
DESCRIPTION = "Binary files of patgen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-patgen-bin-2023.20230311.svn65877-89.1.aarch64.rpm"
RPM_HASH = "2b26afe1e4ee255656cfca824b4c3b19cb853e394f48f7dcc6b70f9cd67e0ac1854c9ee60d3d8386b7e8d59ba65df0499641ee855302c84090a6fe520e91599a"

RPROVIDES:${PN} += "texlive-patgen-bin texlive-patgen-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkpathsea.so.6()(64bit) texlive-patgen"

inherit rpm

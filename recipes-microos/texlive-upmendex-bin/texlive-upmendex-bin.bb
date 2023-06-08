SUMMARY = "Binary files of upmendex"
DESCRIPTION = "Binary files of upmendex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-upmendex-bin-2023.20230311.svn66511-89.1.aarch64.rpm"
RPM_HASH = "91d49448bbb0953f491e8a2439b642b02ec897de6fbbd09bdd7871e19477d796260ed4c3c4dbb298d908a1e79102a2ab2681e73c064228cfc9d6d0e7a3d1cadf"

RPROVIDES:${PN} += "texlive-upmendex-bin texlive-upmendex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libkpathsea.so.6()(64bit) texlive-upmendex"

inherit rpm

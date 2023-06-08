SUMMARY = "Binary files of ps2eps"
DESCRIPTION = "Binary files of ps2eps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-ps2eps-bin-2023.20230311.svn62210-89.1.aarch64.rpm"
RPM_HASH = "02fe1b2f98b8edcdf999ad829ebd71ea4ef5c14d9f66ebb2948f50eeaae46828b168471270f071e8d60d8d3f9a4aaf3d925a39e146e18312ffa5605fa3bd3ed3"

RPROVIDES:${PN} += "texlive-ps2eps-bin texlive-ps2eps-bin(aarch-64) texlive-pstools-bin:/usr/bin/bbox texlive-pstools-bin:/usr/bin/ps2eps"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) texlive-ps2eps"

inherit rpm

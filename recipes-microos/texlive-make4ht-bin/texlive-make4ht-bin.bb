SUMMARY = "Binary files of make4ht"
DESCRIPTION = "Binary files of make4ht"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37750"

RPM_NAME = "texlive-make4ht-bin-2023.20230311.svn37750-89.1.aarch64.rpm"
RPM_HASH = "d276bd64d78d84d0b93e83b2f5d937350fa05b9d083da43d42283c3739ebd1102235087af9aecee3f6f2388c88bee1805219e775e25a51393ed58417bdd9874c"

RPROVIDES:${PN} += "texlive-make4ht-bin texlive-make4ht-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-make4ht"

inherit rpm

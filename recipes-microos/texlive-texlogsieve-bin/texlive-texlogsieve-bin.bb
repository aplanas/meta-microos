SUMMARY = "Binary files of texlogsieve"
DESCRIPTION = "Binary files of texlogsieve"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61328"

RPM_NAME = "texlive-texlogsieve-bin-2023.20230311.svn61328-89.1.aarch64.rpm"
RPM_HASH = "35571a2c7bba662a89d55e056ac4f2f1631843470a6e1aab9931259931da3ba8e40df236c3974370ac4262c5ed308aa666c821ea0ff44027726e60aea2b67b29"

RPROVIDES:${PN} += "texlive-texlogsieve-bin texlive-texlogsieve-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texlogsieve"

inherit rpm

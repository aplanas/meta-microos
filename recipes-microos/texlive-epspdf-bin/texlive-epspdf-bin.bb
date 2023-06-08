SUMMARY = "Binary files of epspdf"
DESCRIPTION = "Binary files of epspdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29050"

RPM_NAME = "texlive-epspdf-bin-2023.20230311.svn29050-89.1.aarch64.rpm"
RPM_HASH = "4095ebee40b05290e0d0c528a709ac77bd28eed5ef782f8e8083342cc76524b677a7256b8a33f4a0ebff4fb96295daba87445900939da829ecb04531c9b182d5"

RPROVIDES:${PN} += "texlive-epspdf-bin texlive-epspdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-epspdf"

inherit rpm

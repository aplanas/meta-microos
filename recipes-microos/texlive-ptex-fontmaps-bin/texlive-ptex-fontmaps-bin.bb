SUMMARY = "Binary files of ptex-fontmaps"
DESCRIPTION = "Binary files of ptex-fontmaps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44206"

RPM_NAME = "texlive-ptex-fontmaps-bin-2023.20230311.svn44206-89.1.aarch64.rpm"
RPM_HASH = "05306a68dd894a9b9507080fe699d928ac48dd640885e4041b3e65b514932c4728f3eb50e78d323ba6bd77bd1a0c245b4298e4116c670706a955fb195f483166"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-bin texlive-ptex-fontmaps-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ptex-fontmaps"

inherit rpm

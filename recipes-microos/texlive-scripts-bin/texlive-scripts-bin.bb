SUMMARY = "Binary files of texlive-scripts"
DESCRIPTION = "Binary files of texlive-scripts"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64356"

RPM_NAME = "texlive-scripts-bin-2023.20230311.svn64356-89.1.aarch64.rpm"
RPM_HASH = "1cd1491c6cd11f5b67ec9057491e1157a3ef957cc6704305a9588ebbff18f9b43679527898a8c968876c814a5d238232044d396c70908dfd0c313dc3ade33e78"

RPROVIDES:${PN} += "texlive-scripts-bin texlive-scripts-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-scripts"

inherit rpm

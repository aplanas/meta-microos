SUMMARY = "Binary files of digestif"
DESCRIPTION = "Binary files of digestif"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65210"

RPM_NAME = "texlive-digestif-bin-2023.20230311.svn65210-89.1.aarch64.rpm"
RPM_HASH = "0ca6a4b853a131d46bb741bb5345d021d71d9db9a13766d9f8423f4431bdab5d90fdd5c7b52d3aa4eeda2176557e87343b9d3157862f8941f6a627baabe9bd3b"

RPROVIDES:${PN} += "texlive-digestif-bin texlive-digestif-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-digestif"

inherit rpm

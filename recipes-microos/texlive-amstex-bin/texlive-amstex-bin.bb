SUMMARY = "Binary files of amstex"
DESCRIPTION = "Binary files of amstex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-amstex-bin-2023.20230311.svn3006-89.1.aarch64.rpm"
RPM_HASH = "40eebf59cd44ef28d938182d417ae1132702db18f2d413ec00fbf309cea4c2cb83b1bd1af363c9143bc6a1c30df0a8cbbc46092fa0ba8915ede795abe680094d"

RPROVIDES:${PN} += "texlive-amstex-bin texlive-amstex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-amstex"

inherit rpm

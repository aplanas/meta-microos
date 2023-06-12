SUMMARY = "Binary files of latex2nemeth"
DESCRIPTION = "Binary files of latex2nemeth"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn42300"

RPM_NAME = "texlive-latex2nemeth-bin-2023.20230311.svn42300-91.1.aarch64.rpm"
RPM_HASH = "1d5c5da6ddbf57e3917c891ec6e54cacb5f90e1234763617913f51ccbca0154bb9ae7c79469aa21e9a5bf1c30395a556ca8da6c6708ee6a10ea847f670399f58"

RPROVIDES:${PN} += "texlive-latex2nemeth-bin texlive-latex2nemeth-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex2nemeth"

inherit rpm

SUMMARY = "Binary files of latex2nemeth"
DESCRIPTION = "Binary files of latex2nemeth"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn42300"

RPM_NAME = "texlive-latex2nemeth-bin-2023.20230311.svn42300-89.1.aarch64.rpm"
RPM_HASH = "3ebd895462ffe5796cce62b4c609de3bba42572fddd502a3acc07169202d19c18efa37b66b534365052c6ca7512654f7ca447bde5a846acf6ca79f77775f5d0a"

RPROVIDES:${PN} += "texlive-latex2nemeth-bin texlive-latex2nemeth-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex2nemeth"

inherit rpm

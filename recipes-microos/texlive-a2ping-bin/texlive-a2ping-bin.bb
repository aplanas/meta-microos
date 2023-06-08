SUMMARY = "Binary files of a2ping"
DESCRIPTION = "Binary files of a2ping"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn27321"

RPM_NAME = "texlive-a2ping-bin-2023.20230311.svn27321-89.1.aarch64.rpm"
RPM_HASH = "51a7e60298ec0796a46d39571d3052a6d481d391c4c8e61dce6ee35c81c9bcdb45b78df99ff3be8118286362433c76e65ce30188d38f104a9abf118330730441"

RPROVIDES:${PN} += "texlive-a2ping-bin texlive-a2ping-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-a2ping"

inherit rpm

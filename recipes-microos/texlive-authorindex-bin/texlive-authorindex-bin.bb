SUMMARY = "Binary files of authorindex"
DESCRIPTION = "Binary files of authorindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18790"

RPM_NAME = "texlive-authorindex-bin-2023.20230311.svn18790-89.1.aarch64.rpm"
RPM_HASH = "cb6f372b23362bd2b91a5e2481eebdb89484959071b0cdc142ddbd590892738793882a0bdf86f249702df29e5e1fa7822725e9129c555b0671720131078be3b1"

RPROVIDES:${PN} += "texlive-authorindex-bin texlive-authorindex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-authorindex"

inherit rpm

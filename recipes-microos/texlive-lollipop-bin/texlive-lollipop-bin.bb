SUMMARY = "Binary files of lollipop"
DESCRIPTION = "Binary files of lollipop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn41465"

RPM_NAME = "texlive-lollipop-bin-2023.20230311.svn41465-91.1.aarch64.rpm"
RPM_HASH = "ddbeabfc5db2b45d587c5904983fc12007628053d08910824c327690b2266374b17fcb21a5edd08cafdfdf52125c99a5889c84b32fd4610d4043c573464ee85a"

RPROVIDES:${PN} += "texlive-lollipop-bin \
texlive-lollipop-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-lollipop"

inherit rpm

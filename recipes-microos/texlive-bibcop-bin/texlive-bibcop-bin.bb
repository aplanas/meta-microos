SUMMARY = "Binary files of bibcop"
DESCRIPTION = "Binary files of bibcop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65257"

RPM_NAME = "texlive-bibcop-bin-2023.20230311.svn65257-91.1.aarch64.rpm"
RPM_HASH = "a2f253979ff101aa55de76d81e357f6aa2efa34a1d7b7ac49f86e0921342c96f0a7b0f63629e8c069fee66fb5ab2c1b80e852749928f8968a1b2ba4a1de424e6"

RPROVIDES:${PN} += "texlive-bibcop-bin \
texlive-bibcop-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-bibcop"

inherit rpm

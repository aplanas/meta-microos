SUMMARY = "Binary files of texdef"
DESCRIPTION = "Binary files of texdef"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45011"

RPM_NAME = "texlive-texdef-bin-2023.20230311.svn45011-89.1.aarch64.rpm"
RPM_HASH = "f84cdc2051dc9b7f7fd61dc3915efb0eb0ac603df127e314cb724bfe659b00556370720b470a980687b19a25d028686bff3521ba4865e04c3090827b45aa1613"

RPROVIDES:${PN} += "texlive-texdef-bin texlive-texdef-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texdef"

inherit rpm

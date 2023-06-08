SUMMARY = "Binary files of lollipop"
DESCRIPTION = "Binary files of lollipop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn41465"

RPM_NAME = "texlive-lollipop-bin-2023.20230311.svn41465-89.1.aarch64.rpm"
RPM_HASH = "526f4feeba5ef2a9349f16c1415118ba666f25671dc48581b3878540d1ae7c96d66a0d70a064d32e8654535d377b2870cfa7c6e24132ca8712132836c5f97b07"

RPROVIDES:${PN} += "texlive-lollipop-bin texlive-lollipop-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-lollipop"

inherit rpm

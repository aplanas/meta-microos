SUMMARY = "Binary files of texaccents"
DESCRIPTION = "Binary files of texaccents"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64447"

RPM_NAME = "texlive-texaccents-bin-2023.20230311.svn64447-89.1.aarch64.rpm"
RPM_HASH = "e315554b0c86678a8ef30a278e1c3c66c6ee56af6c3293324dd5f56ac40b83a734b928c4423ebdd589c7943bc04ad3923f80ec810a99d29c15b3725bf63a1248"

RPROVIDES:${PN} += "texlive-texaccents-bin texlive-texaccents-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texaccents"

inherit rpm

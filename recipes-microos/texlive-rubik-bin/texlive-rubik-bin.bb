SUMMARY = "Binary files of rubik"
DESCRIPTION = "Binary files of rubik"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32919"

RPM_NAME = "texlive-rubik-bin-2023.20230311.svn32919-89.1.aarch64.rpm"
RPM_HASH = "cca63b347d9d033922efa72180a2f8530b21dfc4323a4a60290b7b1467829a0a6b4ded3867a9f821d426b22758d204883cc9f0fda8ff15e2ddc3737850d0e6a3"

RPROVIDES:${PN} += "texlive-rubik-bin texlive-rubik-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-rubik"

inherit rpm

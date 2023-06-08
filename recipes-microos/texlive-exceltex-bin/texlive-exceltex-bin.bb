SUMMARY = "Binary files of exceltex"
DESCRIPTION = "Binary files of exceltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25860"

RPM_NAME = "texlive-exceltex-bin-2023.20230311.svn25860-89.1.aarch64.rpm"
RPM_HASH = "43cc9276514737f8e00936a2fa74ff8f4d0f633be2f9796d99e06c0f895998653d821c6fba47c3eae28d053ffe675f9e038bb6731e928aa57c61613cb7620817"

RPROVIDES:${PN} += "texlive-exceltex-bin texlive-exceltex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-exceltex"

inherit rpm

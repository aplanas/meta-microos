SUMMARY = "Binary files of petri-nets"
DESCRIPTION = "Binary files of petri-nets"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn39165"

RPM_NAME = "texlive-petri-nets-bin-2023.20230311.svn39165-91.1.aarch64.rpm"
RPM_HASH = "c8b62d72a34979e28958f3e4bab07386945c8f8b6bd96c0e27d1f04263dfc916f8d9c90830476e0d7cc084fc1f0f000daa437533309dd5416bf0b2be3dc6f9e9"

RPROVIDES:${PN} += "texlive-petri-nets-bin texlive-petri-nets-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-petri-nets"

inherit rpm

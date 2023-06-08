SUMMARY = "Binary files of perltex"
DESCRIPTION = "Binary files of perltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16181"

RPM_NAME = "texlive-perltex-bin-2023.20230311.svn16181-89.1.aarch64.rpm"
RPM_HASH = "cc2b3cb0be05b8e3db3adf555522312c00dac26a45b512ac3ef63dbd62289f542c6150981bc71466888b1df1c054a655d7d5bcda2283816a0cebd35d5d69a3f0"

RPROVIDES:${PN} += "texlive-perltex-bin texlive-perltex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-perltex"

inherit rpm

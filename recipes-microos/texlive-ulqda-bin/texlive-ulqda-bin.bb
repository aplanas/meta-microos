SUMMARY = "Binary files of ulqda"
DESCRIPTION = "Binary files of ulqda"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-ulqda-bin-2023.20230311.svn13663-89.1.aarch64.rpm"
RPM_HASH = "1862b759ffff520e3187cd8c40e15c15d1f361d1533d9265d2de39666373003f412d31525c756c4c729845e5f4cbfc8bcb209a02d4c8246d32aa5c8a9258f897"

RPROVIDES:${PN} += "texlive-ulqda-bin texlive-ulqda-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ulqda"

inherit rpm

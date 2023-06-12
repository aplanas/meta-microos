SUMMARY = "Binary files of sty2dtx"
DESCRIPTION = "Binary files of sty2dtx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn21215"

RPM_NAME = "texlive-sty2dtx-bin-2023.20230311.svn21215-91.1.aarch64.rpm"
RPM_HASH = "2feebf5394d4ddffda36e3a695ceb289762c6f231954321d9ec5e98875ea2458f988e4bf8accf367cf987011f05804ba80c26a0eba8000ac484379e6a4c6ceff"

RPROVIDES:${PN} += "texlive-sty2dtx-bin texlive-sty2dtx-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-sty2dtx"

inherit rpm

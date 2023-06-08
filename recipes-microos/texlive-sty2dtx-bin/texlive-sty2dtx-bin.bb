SUMMARY = "Binary files of sty2dtx"
DESCRIPTION = "Binary files of sty2dtx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn21215"

RPM_NAME = "texlive-sty2dtx-bin-2023.20230311.svn21215-89.1.aarch64.rpm"
RPM_HASH = "6afd2db60b529ca3b53314fd397f9a5ee4a08d614939fb214691bbbff9b2c90a4442cd16caeee1b05da36dc342719fdbd09c20b782fde6d982471afecf8ee724"

RPROVIDES:${PN} += "texlive-sty2dtx-bin texlive-sty2dtx-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-sty2dtx"

inherit rpm

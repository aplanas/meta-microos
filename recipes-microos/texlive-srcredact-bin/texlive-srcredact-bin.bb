SUMMARY = "Binary files of srcredact"
DESCRIPTION = "Binary files of srcredact"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38710"

RPM_NAME = "texlive-srcredact-bin-2023.20230311.svn38710-89.1.aarch64.rpm"
RPM_HASH = "8fe427d642e04053d92d1df1c50e6e314df77ebd252d71227db507545f597205dd71a727bd875b814741f897f0d74539af3874cf303e27eaad6356651afe785a"

RPROVIDES:${PN} += "texlive-srcredact-bin texlive-srcredact-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-srcredact"

inherit rpm

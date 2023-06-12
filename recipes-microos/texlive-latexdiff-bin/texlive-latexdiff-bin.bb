SUMMARY = "Binary files of latexdiff"
DESCRIPTION = "Binary files of latexdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16420"

RPM_NAME = "texlive-latexdiff-bin-2023.20230311.svn16420-91.1.aarch64.rpm"
RPM_HASH = "6c515c197d87233c9a6fd5b4fbe5556455dac423de1587338d36a3bef713a5f38f34850677a16752fc2ccb65dc6c27e46cf9b0082e8c0e956dc876c1833d480d"

RPROVIDES:${PN} += "texlive-latexdiff-bin \
texlive-latexdiff-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latexdiff"

inherit rpm

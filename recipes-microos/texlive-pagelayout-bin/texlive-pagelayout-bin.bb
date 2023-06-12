SUMMARY = "Binary files of pagelayout"
DESCRIPTION = "Binary files of pagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65625"

RPM_NAME = "texlive-pagelayout-bin-2023.20230311.svn65625-91.1.aarch64.rpm"
RPM_HASH = "df0b3d20a1aa81f160084520ab1be4bd451ef7035ea812379b8f7d54b4ff529feacaa419b18903ac7d2c79cb83c5cdfa3955a0533a89b1ede950787b0f0f689a"

RPROVIDES:${PN} += "texlive-pagelayout-bin \
texlive-pagelayout-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pagelayout"

inherit rpm

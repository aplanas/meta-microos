SUMMARY = "Binary files of cjk-gs-integrate"
DESCRIPTION = "Binary files of cjk-gs-integrate"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37223"

RPM_NAME = "texlive-cjk-gs-integrate-bin-2023.20230311.svn37223-91.1.aarch64.rpm"
RPM_HASH = "440dc7d11bf266d90a2a97b05b29c4e44b42da7fcb43c257fa535fae06be8a3d8ebc95a1e12538936746a545c88993c1e80c0712562d3e00d943a37427b2b884"

RPROVIDES:${PN} += "texlive-cjk-gs-integrate-bin \
texlive-cjk-gs-integrate-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-cjk-gs-integrate"

inherit rpm

SUMMARY = "Binary files of tpic2pdftex"
DESCRIPTION = "Binary files of tpic2pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50281"

RPM_NAME = "texlive-tpic2pdftex-bin-2023.20230311.svn50281-91.1.aarch64.rpm"
RPM_HASH = "ebf366eeb477e0ca6dc25bd8302b5c9556a877c56179d0435bf6131695743a0f12f3bf210f8f849ec43fa92416f2d2d81c14436d8f10efeb2e35e97e5ad7aebc"

RPROVIDES:${PN} += "texlive-tpic2pdftex-bin \
texlive-tpic2pdftex-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
texlive-tpic2pdftex"

inherit rpm

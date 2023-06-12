SUMMARY = "Binary files of xelatex-dev"
DESCRIPTION = "Binary files of xelatex-dev"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53999"

RPM_NAME = "texlive-xelatex-dev-bin-2023.20230311.svn53999-91.1.aarch64.rpm"
RPM_HASH = "99fa1583b4b7e323ff1c40a02721658e19d60f458b30c5cfcc4ad7f4c597350d9cf32c77d1e7d44fd0c55a495751f6a3ebdb895bd964a9600af61522f457dc23"

RPROVIDES:${PN} += "texlive-xelatex-dev-bin \
texlive-xelatex-dev-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-xelatex-dev"

inherit rpm

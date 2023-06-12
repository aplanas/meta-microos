SUMMARY = "Binary files of amstex"
DESCRIPTION = "Binary files of amstex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-amstex-bin-2023.20230311.svn3006-91.1.aarch64.rpm"
RPM_HASH = "62776f6e6734e073e7b72c2c0c841475ef8ff7d2ad9320a5b231f52e18b51c38ddde9a4f8c1422c22963a98083ed1bcb08551021598fda029fdd38b1f0d8bef1"

RPROVIDES:${PN} += "texlive-amstex-bin \
texlive-amstex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-amstex"

inherit rpm

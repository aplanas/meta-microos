SUMMARY = "Binary files of mltex"
DESCRIPTION = "Binary files of mltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-mltex-bin-2023.20230311.svn3006-91.1.aarch64.rpm"
RPM_HASH = "1981249c6fee09b79875777506480a4e1c6fc8650ad9e6142e2d30f9189269cc7975f47982ef69d9c0c647b5af56cf67e479f3f0d3896179226b0b2cbbde538c"

RPROVIDES:${PN} += "texlive-mltex-bin texlive-mltex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mltex"

inherit rpm

SUMMARY = "Binary files of fontinst"
DESCRIPTION = "Binary files of fontinst"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53554"

RPM_NAME = "texlive-fontinst-bin-2023.20230311.svn53554-91.1.aarch64.rpm"
RPM_HASH = "f221efda8c9d707d0c8346545a07fd9b37c4e908d793e32ee1f6a5944774f3efd83394101dac8157125853a60b9b3fda12e9572901f0039fa831d634be776eef"

RPROVIDES:${PN} += "texlive-fontinst-bin texlive-fontinst-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-fontinst"

inherit rpm

SUMMARY = "Binary files of exceltex"
DESCRIPTION = "Binary files of exceltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25860"

RPM_NAME = "texlive-exceltex-bin-2023.20230311.svn25860-91.1.aarch64.rpm"
RPM_HASH = "59a3eeecfeb3763345066c85eb6e8039ad6bb966e5837af0d6d4d9e0b04a6e051df6d07b8373017aaabfc4d6994544700143f3e98d6710b530073b6c405800cd"

RPROVIDES:${PN} += "texlive-exceltex-bin texlive-exceltex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-exceltex"

inherit rpm

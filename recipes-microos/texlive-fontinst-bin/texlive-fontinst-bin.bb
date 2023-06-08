SUMMARY = "Binary files of fontinst"
DESCRIPTION = "Binary files of fontinst"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53554"

RPM_NAME = "texlive-fontinst-bin-2023.20230311.svn53554-89.1.aarch64.rpm"
RPM_HASH = "9acce57a6b07f3f8ebbeba59790f085ef2cdf9a100b7422a526e1ffeabdf86eb67199b435e4e570e911c38129fdaf1b6d9a289c82c741ce741b7973eaba78089"

RPROVIDES:${PN} += "texlive-fontinst-bin texlive-fontinst-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-fontinst"

inherit rpm

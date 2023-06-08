SUMMARY = "Binary files of latexmk"
DESCRIPTION = "Binary files of latexmk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn10937"

RPM_NAME = "texlive-latexmk-bin-2023.20230311.svn10937-89.1.aarch64.rpm"
RPM_HASH = "8d9098d77d6af3f99460ae33ca4e029e2ed513b7cc42149c8dbb8f9a1de30a7bd87b3b7618afdc0916a6076dd83f9c844653f3c431a17877514c40417b49c264"

RPROVIDES:${PN} += "texlive-latexmk-bin texlive-latexmk-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latexmk"

inherit rpm

SUMMARY = "Binary files of latex-bin"
DESCRIPTION = "Binary files of latex-bin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn54358"

RPM_NAME = "texlive-latex-bin-bin-2023.20230311.svn54358-89.1.aarch64.rpm"
RPM_HASH = "a23f648be8d5a4cddd5e146c3bdc373c0537b2d39d395e46063b38a383edc817528ed38c153113713bcaca9a367f21ef977017535034846347385deab9b939a6"

RPROVIDES:${PN} += "texlive-latex-bin-bin texlive-latex-bin-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex-bin"

inherit rpm

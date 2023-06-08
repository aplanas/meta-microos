SUMMARY = "Binary files of light-latex-make"
DESCRIPTION = "Binary files of light-latex-make"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn56352"

RPM_NAME = "texlive-light-latex-make-bin-2023.20230311.svn56352-89.1.aarch64.rpm"
RPM_HASH = "e1e52fee93435e28d033a23cea6db7b57393742d5a2e374d56d68eeb305a21e9a368d1a16c29a3b057ae1e6cd31e849ce93c0f60e45d55590fa6c23279922f53"

RPROVIDES:${PN} += "texlive-light-latex-make-bin texlive-light-latex-make-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-light-latex-make"

inherit rpm

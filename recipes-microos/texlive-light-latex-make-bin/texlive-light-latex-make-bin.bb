SUMMARY = "Binary files of light-latex-make"
DESCRIPTION = "Binary files of light-latex-make"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn56352"

RPM_NAME = "texlive-light-latex-make-bin-2023.20230311.svn56352-91.1.aarch64.rpm"
RPM_HASH = "604c65ddd72d28b1106060f0a9f7a6f773d23694d375438628acc57ff3d333203e343c67aa715d194af8a7fc0d87473465cabbb8be83f2789dbc939fda031f76"

RPROVIDES:${PN} += "texlive-light-latex-make-bin \
texlive-light-latex-make-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-light-latex-make"

inherit rpm

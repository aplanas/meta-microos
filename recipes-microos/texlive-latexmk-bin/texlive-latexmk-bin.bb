SUMMARY = "Binary files of latexmk"
DESCRIPTION = "Binary files of latexmk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn10937"

RPM_NAME = "texlive-latexmk-bin-2023.20230311.svn10937-91.1.aarch64.rpm"
RPM_HASH = "a511124fc6e6374193ba62f874e8e0bd7dc4ebf381eae736fe516912a5c077a61ebd05ef5881a1983a0d11bdf06eed79d92b964700276995d2d438fd530198fa"

RPROVIDES:${PN} += "texlive-latexmk-bin texlive-latexmk-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latexmk"

inherit rpm

SUMMARY = "Binary files of thumbpdf"
DESCRIPTION = "Binary files of thumbpdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn6898"

RPM_NAME = "texlive-thumbpdf-bin-2023.20230311.svn6898-89.1.aarch64.rpm"
RPM_HASH = "9dcc73a92a2e80577858d98ae7934bd95cb4ff290a7bf505cd82cd3f0162cb96ff8f04544f92478d26a083e4eff414842f6956e652be4f4d18a23460366288dd"

RPROVIDES:${PN} += "texlive-thumbpdf-bin texlive-thumbpdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-thumbpdf"

inherit rpm

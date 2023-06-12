SUMMARY = "Binary files of thumbpdf"
DESCRIPTION = "Binary files of thumbpdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn6898"

RPM_NAME = "texlive-thumbpdf-bin-2023.20230311.svn6898-91.1.aarch64.rpm"
RPM_HASH = "5b94c77113c559277dbf4beeac3dc807ef8a00c906e50636001935389b565eac6210f9b1646afad1b23bad3be991f584bf316ea1f9ee8186843680bc1647058d"

RPROVIDES:${PN} += "texlive-thumbpdf-bin texlive-thumbpdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-thumbpdf"

inherit rpm

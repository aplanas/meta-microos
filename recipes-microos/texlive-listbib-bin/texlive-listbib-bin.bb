SUMMARY = "Binary files of listbib"
DESCRIPTION = "Binary files of listbib"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn26126"

RPM_NAME = "texlive-listbib-bin-2023.20230311.svn26126-89.1.aarch64.rpm"
RPM_HASH = "357052155d2c188fb1c9adc29e127239ed03f8dc9ad37f94ec319e51e650bbeb78c4213d3d09e0931c800d57e37bd686bd390f4b855b3f341aab6b24f10343d6"

RPROVIDES:${PN} += "texlive-listbib-bin texlive-listbib-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-listbib"

inherit rpm

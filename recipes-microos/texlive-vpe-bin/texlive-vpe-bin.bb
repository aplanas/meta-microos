SUMMARY = "Binary files of vpe"
DESCRIPTION = "Binary files of vpe"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn6897"

RPM_NAME = "texlive-vpe-bin-2023.20230311.svn6897-89.1.aarch64.rpm"
RPM_HASH = "c6258d2f2f57d5292cd423599f348e92882135574a77cc38d3a68db4d61c2f7aeadeabc20e99f51fdeebe0734b851d390d0b5815e2523e01511f08dfbb415a4b"

RPROVIDES:${PN} += "texlive-vpe-bin texlive-vpe-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-vpe"

inherit rpm

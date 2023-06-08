SUMMARY = "Binary files of xelatex-dev"
DESCRIPTION = "Binary files of xelatex-dev"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53999"

RPM_NAME = "texlive-xelatex-dev-bin-2023.20230311.svn53999-89.1.aarch64.rpm"
RPM_HASH = "d7a131e088ccd10842150671e6dc5e0af67a2592e027e3e747500d71ed0f0cb132dfd2919894f44ea8fe159e186da69cca20021eb0ef79731490c7ea2db26306"

RPROVIDES:${PN} += "texlive-xelatex-dev-bin texlive-xelatex-dev-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-xelatex-dev"

inherit rpm

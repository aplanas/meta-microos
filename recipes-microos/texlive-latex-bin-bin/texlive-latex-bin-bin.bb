SUMMARY = "Binary files of latex-bin"
DESCRIPTION = "Binary files of latex-bin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn54358"

RPM_NAME = "texlive-latex-bin-bin-2023.20230311.svn54358-91.1.aarch64.rpm"
RPM_HASH = "0ce6d6661e50e6233ef19d9c6f0cbd891fd686f92a8f86dcaaf41bcdb96a9270e86a37a98dd6e0ca025fd582b48d2ba670acc78c951fcc7ff1a758b63fcba391"

RPROVIDES:${PN} += "texlive-latex-bin-bin \
texlive-latex-bin-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex-bin"

inherit rpm

SUMMARY = "Binary files of latexdiff"
DESCRIPTION = "Binary files of latexdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16420"

RPM_NAME = "texlive-latexdiff-bin-2023.20230311.svn16420-89.1.aarch64.rpm"
RPM_HASH = "953bd5d1626a1ef6a19d052985a541aa4b75c258189b8c810cd33c01ca7e430746abea943c12f1cfbaba64db71f8580a40fcfa18cc61f286e1ee1c39249be30e"

RPROVIDES:${PN} += "texlive-latexdiff-bin texlive-latexdiff-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latexdiff"

inherit rpm

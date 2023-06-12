SUMMARY = "Binary files of latex-bin-dev"
DESCRIPTION = "Binary files of latex-bin-dev"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53999"

RPM_NAME = "texlive-latex-bin-dev-bin-2023.20230311.svn53999-91.1.aarch64.rpm"
RPM_HASH = "f6e4f87d6d27f1a0c9ce01ebea05ac6cb68869a3d7421fc86f00955107a1c0e367e73dcbcae5d564ad5b07832342550a674cef70b4d8ce1f23dac33c06c3fe97"

RPROVIDES:${PN} += "texlive-latex-bin-dev-bin texlive-latex-bin-dev-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex-bin-dev"

inherit rpm

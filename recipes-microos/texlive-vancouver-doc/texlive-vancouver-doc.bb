SUMMARY = "Documentation for texlive-vancouver"
DESCRIPTION = "This package includes the documentation for texlive-vancouver"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn59192"

RPM_NAME = "texlive-vancouver-doc-2023.201.1.0svn59192-53.1.noarch.rpm"
RPM_HASH = "cbe660782571de5a321f9cea477343c65f188e1c974ae65019e17df39e2c402fd4d771986d5541b75adf9621059374d1e313fffd3463c1ff75a6b381c796bf7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vancouver-doc"
RDEPENDS:${PN} += ""

inherit rpm

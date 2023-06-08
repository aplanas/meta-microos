SUMMARY = "Binary files of pdflatexpicscale"
DESCRIPTION = "Binary files of pdflatexpicscale"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn41779"

RPM_NAME = "texlive-pdflatexpicscale-bin-2023.20230311.svn41779-89.1.aarch64.rpm"
RPM_HASH = "16e3a7e2015031ce0523e1d1f2325c2a0d113624a855db682892f257b3c6d4c6cb72a053f6399c5b9c14e25e99f1a8ef309e1a10a33556098019f48b1bb009b1"

RPROVIDES:${PN} += "texlive-pdflatexpicscale-bin texlive-pdflatexpicscale-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pdflatexpicscale"

inherit rpm

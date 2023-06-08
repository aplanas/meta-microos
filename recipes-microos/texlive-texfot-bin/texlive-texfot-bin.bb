SUMMARY = "Binary files of texfot"
DESCRIPTION = "Binary files of texfot"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn33155"

RPM_NAME = "texlive-texfot-bin-2023.20230311.svn33155-89.1.aarch64.rpm"
RPM_HASH = "ac89b62914f0aae95d69b3d68941720a4c16ee416ee7864eac429be310f54898ef067aaee8b8e8984d53b944874f72452a4123815466f422663377706e785c8a"

RPROVIDES:${PN} += "texlive-texfot-bin texlive-texfot-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texfot"

inherit rpm

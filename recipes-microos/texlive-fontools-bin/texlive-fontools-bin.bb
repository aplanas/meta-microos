SUMMARY = "Binary files of fontools"
DESCRIPTION = "Binary files of fontools"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25997"

RPM_NAME = "texlive-fontools-bin-2023.20230311.svn25997-89.1.aarch64.rpm"
RPM_HASH = "5bad9bc002291e635d10dd3b4878fbbeedfd06bafd6fae3226d0e4ccd7b59efcb8247bba3dbc35eca5eaae4443b9e991dfe975bb30c8436f243824653e52b954"

RPROVIDES:${PN} += "texlive-fontools-bin texlive-fontools-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-fontools"

inherit rpm

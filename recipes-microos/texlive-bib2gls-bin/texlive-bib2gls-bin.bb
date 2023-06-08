SUMMARY = "Binary files of bib2gls"
DESCRIPTION = "Binary files of bib2gls"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45266"

RPM_NAME = "texlive-bib2gls-bin-2023.20230311.svn45266-89.1.aarch64.rpm"
RPM_HASH = "6770249ae5e8c9ca0302192d374d239c866146eb6e765a1eadf9eed2e0b5315e5a3029aadfcdcb606a2c94c9cda5fa01c863a2ac3bbeb25504f3d42b322ecc4b"

RPROVIDES:${PN} += "texlive-bib2gls-bin texlive-bib2gls-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-bib2gls"

inherit rpm

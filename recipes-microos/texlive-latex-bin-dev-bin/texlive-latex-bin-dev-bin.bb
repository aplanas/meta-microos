SUMMARY = "Binary files of latex-bin-dev"
DESCRIPTION = "Binary files of latex-bin-dev"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53999"

RPM_NAME = "texlive-latex-bin-dev-bin-2023.20230311.svn53999-89.1.aarch64.rpm"
RPM_HASH = "c225aa00537e0d132f4fcd958f5a12c3dce56745a2d432ab566201ead4f8733c53b1c5cdd9eb2c2af73d1bda254cac1a084596fc94271d0991962688cd5b7d86"

RPROVIDES:${PN} += "texlive-latex-bin-dev-bin texlive-latex-bin-dev-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex-bin-dev"

inherit rpm

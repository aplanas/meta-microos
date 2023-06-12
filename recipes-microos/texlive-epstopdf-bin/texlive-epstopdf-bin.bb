SUMMARY = "Binary files of epstopdf"
DESCRIPTION = "Binary files of epstopdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18336"

RPM_NAME = "texlive-epstopdf-bin-2023.20230311.svn18336-91.1.aarch64.rpm"
RPM_HASH = "5dd4bbe88d07951c1a4040ac4424a916e0bcf7d78eb9ed7f78199c89e32114d8aed2b161251b6f4df53d8be98edb03c9e830c5b74465abd8060c95cdb2fcf8b5"

RPROVIDES:${PN} += "texlive-epstopdf-bin \
texlive-epstopdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-epstopdf"

inherit rpm

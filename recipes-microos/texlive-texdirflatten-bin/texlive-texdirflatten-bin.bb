SUMMARY = "Binary files of texdirflatten"
DESCRIPTION = "Binary files of texdirflatten"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn12782"

RPM_NAME = "texlive-texdirflatten-bin-2023.20230311.svn12782-91.1.aarch64.rpm"
RPM_HASH = "abb664270f23cbfe16c7ebb3b243602f794c5c4c862149b615938ac460043eb563613101acfcb37a27bcf579e2f21d1a06a9247a54ec56f17239ffac6769abae"

RPROVIDES:${PN} += "texlive-texdirflatten-bin \
texlive-texdirflatten-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texdirflatten"

inherit rpm

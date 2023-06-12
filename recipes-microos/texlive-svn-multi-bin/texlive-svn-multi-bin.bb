SUMMARY = "Binary files of svn-multi"
DESCRIPTION = "Binary files of svn-multi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-svn-multi-bin-2023.20230311.svn13663-91.1.aarch64.rpm"
RPM_HASH = "c2049599612c693d69ebb331125741860e251528c464f09a8429c9eaeea4b2cf7c4b0b89020eb1a6d26e01a09e18190c431e45893e9b1a6c2a202390918341cc"

RPROVIDES:${PN} += "texlive-svn-multi-bin texlive-svn-multi-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-svn-multi"

inherit rpm

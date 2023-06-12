SUMMARY = "Binary files of match_parens"
DESCRIPTION = "Binary files of match_parens"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23500"

RPM_NAME = "texlive-match_parens-bin-2023.20230311.svn23500-91.1.aarch64.rpm"
RPM_HASH = "4147b2ee2c3f15ff0e672551f104ec2735d5ad6d9ba84e2dc09fca797f1b4b4a97ea8a6b2b60da43242e62bd87f5bd0c1ab092d007ef4440bdfd291c8c9f87ce"

RPROVIDES:${PN} += "texlive-match_parens-bin texlive-match_parens-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-match_parens"

inherit rpm

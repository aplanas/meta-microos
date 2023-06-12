SUMMARY = "Binary files of listbib"
DESCRIPTION = "Binary files of listbib"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn26126"

RPM_NAME = "texlive-listbib-bin-2023.20230311.svn26126-91.1.aarch64.rpm"
RPM_HASH = "8ec334b4375f85561e9c06080e9151eabc6b6f01546cf64bd200b3e38c4f9d1967a1025d2c31419136e1af9f13e1f629c967c98d1e9f02d5d46399c2711eb783"

RPROVIDES:${PN} += "texlive-listbib-bin texlive-listbib-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-listbib"

inherit rpm

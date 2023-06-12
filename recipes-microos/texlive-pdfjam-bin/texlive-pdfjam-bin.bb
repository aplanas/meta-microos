SUMMARY = "Binary files of pdfjam"
DESCRIPTION = "Binary files of pdfjam"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52858"

RPM_NAME = "texlive-pdfjam-bin-2023.20230311.svn52858-91.1.aarch64.rpm"
RPM_HASH = "f95d3bc3334d4c176c0f4612537ddba97cbe127a5c07145b0f0eb1ffbdf8eb0fe007b630e007eb82fa09a1fef0a34a49a07c21e148a3bc47c1b7c0a91227f473"

RPROVIDES:${PN} += "pdfjam texlive-pdfjam-bin texlive-pdfjam-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pdfjam"

inherit rpm

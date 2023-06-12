SUMMARY = "Binary files of pmxchords"
DESCRIPTION = "Binary files of pmxchords"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32405"

RPM_NAME = "texlive-pmxchords-bin-2023.20230311.svn32405-91.1.aarch64.rpm"
RPM_HASH = "cfeef7b5b8e152c697a78d0dcaec9f6975c59239d40791a5b294884c2175c78503c7e88f0d03e1d7b2f52cb1664733100095ceeba866fad879805d0986adf079"

RPROVIDES:${PN} += "texlive-pmxchords-bin texlive-pmxchords-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pmxchords"

inherit rpm

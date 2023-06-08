SUMMARY = "Binary files of jadetex"
DESCRIPTION = "Binary files of jadetex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-jadetex-bin-2023.20230311.svn3006-89.1.aarch64.rpm"
RPM_HASH = "3e92a710e339df00cf268922ab9ed1f9738a68864499b029edba4e18b45a1f78aac04b7347868eefa542ce973421c4a27c383b22f6ecd1d4058f1d63b7704cb5"

RPROVIDES:${PN} += "texlive-jadetex-bin texlive-jadetex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-jadetex"

inherit rpm

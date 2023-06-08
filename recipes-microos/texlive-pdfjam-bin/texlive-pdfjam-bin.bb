SUMMARY = "Binary files of pdfjam"
DESCRIPTION = "Binary files of pdfjam"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52858"

RPM_NAME = "texlive-pdfjam-bin-2023.20230311.svn52858-89.1.aarch64.rpm"
RPM_HASH = "628cc29e9ba593bb7d842fc1428f898da6a64f7a31d07e7e9a78f2cd653b36752b1c9686cee589e2f1d1295f3680abdf7f96ba959e00143f53366b65691940f9"

RPROVIDES:${PN} += "texlive-pdfjam-bin texlive-pdfjam-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pdfjam"

inherit rpm

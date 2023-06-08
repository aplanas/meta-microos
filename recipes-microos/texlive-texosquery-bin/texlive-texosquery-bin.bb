SUMMARY = "Binary files of texosquery"
DESCRIPTION = "Binary files of texosquery"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn43596"

RPM_NAME = "texlive-texosquery-bin-2023.20230311.svn43596-89.1.aarch64.rpm"
RPM_HASH = "a8b47977a4e8d49c42c19a78cb0e4ec7e17b0e039d432966fb75ca3869fcc807c65ef5b847ba3820847f444446edbcfb748e68ee85eb879f5ac7770016307411"

RPROVIDES:${PN} += "texlive-texosquery-bin texlive-texosquery-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texosquery"

inherit rpm

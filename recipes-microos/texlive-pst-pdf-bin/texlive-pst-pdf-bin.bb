SUMMARY = "Binary files of pst-pdf"
DESCRIPTION = "Binary files of pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn7838"

RPM_NAME = "texlive-pst-pdf-bin-2023.20230311.svn7838-89.1.aarch64.rpm"
RPM_HASH = "14c8db0d4cde09ab9dd860981407765b058aa79693b46c865774bc588db8b85b179426181a0212ba8e0ce29445d5b6d5115775a6242d2279bc80a8f744fc997e"

RPROVIDES:${PN} += "texlive-pst-pdf-bin texlive-pst-pdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pst-pdf"

inherit rpm

SUMMARY = "Binary files of attachfile2"
DESCRIPTION = "Binary files of attachfile2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52909"

RPM_NAME = "texlive-attachfile2-bin-2023.20230311.svn52909-89.1.aarch64.rpm"
RPM_HASH = "67efb83736a9e48b95092df6ff1b9e056250b337207578e0693901f9b15981ba7f22e1c846871040d0a876263d0d82ba1ce77fb32636065ce06a891f3a294907"

RPROVIDES:${PN} += "texlive-attachfile2-bin texlive-attachfile2-bin(aarch-64) texlive-pdftools-bin:/usr/bin/pdfatfi"
RDEPENDS:${PN} += "texlive-attachfile2"

inherit rpm

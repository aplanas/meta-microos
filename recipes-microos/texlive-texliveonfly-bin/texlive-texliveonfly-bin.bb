SUMMARY = "Binary files of texliveonfly"
DESCRIPTION = "Binary files of texliveonfly"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24062"

RPM_NAME = "texlive-texliveonfly-bin-2023.20230311.svn24062-89.1.aarch64.rpm"
RPM_HASH = "fc2db2c094a68662ea385b5c9a103aec81ef06e2e0fe7d1617d7fcfc0476ce855750491adb3072d8b3e4910331dd7de2d319eda98c782b9514443ed6255b1aba"

RPROVIDES:${PN} += "texlive-texliveonfly-bin texlive-texliveonfly-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texliveonfly"

inherit rpm

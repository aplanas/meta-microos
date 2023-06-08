SUMMARY = "Binary files of svn-multi"
DESCRIPTION = "Binary files of svn-multi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-svn-multi-bin-2023.20230311.svn13663-89.1.aarch64.rpm"
RPM_HASH = "2494bcf038e47020d5fe0dc184e7b58039c100e61fbb8dedf938ca4982b3acfbe0cbc99cc31173599a45bdde338fb96d47b942c4335ee2d10ca5afab5c2ec18d"

RPROVIDES:${PN} += "texlive-svn-multi-bin texlive-svn-multi-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-svn-multi"

inherit rpm

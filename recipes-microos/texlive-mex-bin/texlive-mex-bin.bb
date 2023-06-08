SUMMARY = "Binary files of mex"
DESCRIPTION = "Binary files of mex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-mex-bin-2023.20230311.svn3006-89.1.aarch64.rpm"
RPM_HASH = "c0252ebad730e268ae439fd3a855d68977f41ccb83948e68a26b8d257ce587c5eecdb83e2e6a8309a088e9fb276cc13fcfd055a0dd1df5d309623b179db83ada"

RPROVIDES:${PN} += "texlive-mex-bin texlive-mex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mex"

inherit rpm

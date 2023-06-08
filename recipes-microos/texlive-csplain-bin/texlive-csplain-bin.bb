SUMMARY = "Binary files of csplain"
DESCRIPTION = "Binary files of csplain"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50528"

RPM_NAME = "texlive-csplain-bin-2023.20230311.svn50528-89.1.aarch64.rpm"
RPM_HASH = "b2c3cc154c2d370d48c5213ff5b140501aa9293b3e6e1c9fdf829f13c3b12dd6ce47cce76687d0d6c293279037aa98c52eef0d0ac2e7002fae026c46074727c2"

RPROVIDES:${PN} += "texlive-csplain-bin texlive-csplain-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-csplain"

inherit rpm

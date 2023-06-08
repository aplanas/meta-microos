SUMMARY = "Binary files of latexpand"
DESCRIPTION = "Binary files of latexpand"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn27025"

RPM_NAME = "texlive-latexpand-bin-2023.20230311.svn27025-89.1.aarch64.rpm"
RPM_HASH = "feab7e1978ccce67f1353a7b2147c806df5c2ad82abcb54b74c83331681df5dbb72f9ade8b9d2977ab21b51b407a025cc20d32571b9f10938ea09708cc41aeea"

RPROVIDES:${PN} += "texlive-latexpand-bin texlive-latexpand-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latexpand"

inherit rpm

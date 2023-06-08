SUMMARY = "Binary files of checklistings"
DESCRIPTION = "Binary files of checklistings"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38300"

RPM_NAME = "texlive-checklistings-bin-2023.20230311.svn38300-89.1.aarch64.rpm"
RPM_HASH = "4ec818e6f7e0821c9872ceced864cae18655b22b3183eb38d6816c442c4829f9c6b4eb2736c855fee8f1f563562036182611b55cd1a2454f6d75ebdfa99e2837"

RPROVIDES:${PN} += "texlive-checklistings-bin texlive-checklistings-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-checklistings"

inherit rpm

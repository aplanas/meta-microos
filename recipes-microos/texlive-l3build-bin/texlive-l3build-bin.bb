SUMMARY = "Binary files of l3build"
DESCRIPTION = "Binary files of l3build"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46894"

RPM_NAME = "texlive-l3build-bin-2023.20230311.svn46894-89.1.aarch64.rpm"
RPM_HASH = "5cd6e64e57bc817765efcbc38c1fee4a511d6f592985be927c66ef8075abedf2ab55de8dff55f160f31bfd3a2fe0e0f542ed6e7da7fff655c505f28629c097b2"

RPROVIDES:${PN} += "texlive-l3build-bin texlive-l3build-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-l3build"

inherit rpm

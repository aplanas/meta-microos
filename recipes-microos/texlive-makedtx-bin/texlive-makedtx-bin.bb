SUMMARY = "Binary files of makedtx"
DESCRIPTION = "Binary files of makedtx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38769"

RPM_NAME = "texlive-makedtx-bin-2023.20230311.svn38769-89.1.aarch64.rpm"
RPM_HASH = "3d9c3bb8d1defb912efe8414f00736db5b42972cc8bc8a311d1dd60df66dd0680bde257c04862a89d1496191a742dd3eb5ec79a0ef6334a22a9761814cfe040e"

RPROVIDES:${PN} += "texlive-makedtx-bin texlive-makedtx-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-makedtx"

inherit rpm

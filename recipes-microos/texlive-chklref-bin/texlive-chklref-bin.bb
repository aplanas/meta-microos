SUMMARY = "Binary files of chklref"
DESCRIPTION = "Binary files of chklref"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52631"

RPM_NAME = "texlive-chklref-bin-2023.20230311.svn52631-89.1.aarch64.rpm"
RPM_HASH = "f07ada6a717a58b729f0f9882e690b4ceb72a783d585e6f793054310285182b31a9d547b481397da34a0606d1b952cca2460bb89179a74a5356fb11a2909efc0"

RPROVIDES:${PN} += "texlive-chklref-bin texlive-chklref-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-chklref"

inherit rpm

SUMMARY = "Binary files of optexcount"
DESCRIPTION = "Binary files of optexcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn59817"

RPM_NAME = "texlive-optexcount-bin-2023.20230311.svn59817-89.1.aarch64.rpm"
RPM_HASH = "77ea3968631bcb3051e90ee674cefb16b5e62ecfcf7a20aeeac75d08656517cb609f234f8bea62cb1bcaef4914386f93825d695d3d20599bb6769db1b461b987"

RPROVIDES:${PN} += "texlive-optexcount-bin texlive-optexcount-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-optexcount"

inherit rpm

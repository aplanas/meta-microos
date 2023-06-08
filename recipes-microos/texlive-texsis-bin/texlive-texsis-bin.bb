SUMMARY = "Binary files of texsis"
DESCRIPTION = "Binary files of texsis"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-texsis-bin-2023.20230311.svn3006-89.1.aarch64.rpm"
RPM_HASH = "3b76dc28324facedb3c1cd19973c940e938f249382f25aebe8cb1e04afefbc543997aa1979730f66809ca9e66a7264a71ce0a36e3107bc75c074b23fb7f7e437"

RPROVIDES:${PN} += "texlive-texsis-bin texlive-texsis-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texsis"

inherit rpm

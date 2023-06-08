SUMMARY = "Binary files of bibexport"
DESCRIPTION = "Binary files of bibexport"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16219"

RPM_NAME = "texlive-bibexport-bin-2023.20230311.svn16219-89.1.aarch64.rpm"
RPM_HASH = "5943942a24dc16e7d6accf7cde265599dee0da454d13688605b16339aeefb6e698e9dc8bfcfd15575208a1a3d7e5680b857ad3407ed500e72302260ec9ddc89d"

RPROVIDES:${PN} += "texlive-bibexport-bin texlive-bibexport-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-bibexport"

inherit rpm

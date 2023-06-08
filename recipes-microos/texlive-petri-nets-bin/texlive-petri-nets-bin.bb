SUMMARY = "Binary files of petri-nets"
DESCRIPTION = "Binary files of petri-nets"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn39165"

RPM_NAME = "texlive-petri-nets-bin-2023.20230311.svn39165-89.1.aarch64.rpm"
RPM_HASH = "5622137adef9e1c3602923f974f678ff0cf308d6d4483776165b171bc25402c5916e8997a2278b77ff69d57b5308c0f30faea86d1c562e174702aa86a0721bc3"

RPROVIDES:${PN} += "texlive-petri-nets-bin texlive-petri-nets-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-petri-nets"

inherit rpm

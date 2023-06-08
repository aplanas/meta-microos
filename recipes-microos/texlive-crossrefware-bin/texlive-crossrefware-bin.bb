SUMMARY = "Binary files of crossrefware"
DESCRIPTION = "Binary files of crossrefware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45927"

RPM_NAME = "texlive-crossrefware-bin-2023.20230311.svn45927-89.1.aarch64.rpm"
RPM_HASH = "d4de119584c475d12d0178876962e368123d77b31a6a7ec14715d743f547e8869ae6260233c49c40a4316f04eea35b1ffa43374a1e0a58b141e6f5ac8ade1ad9"

RPROVIDES:${PN} += "texlive-crossrefware-bin texlive-crossrefware-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-crossrefware"

inherit rpm

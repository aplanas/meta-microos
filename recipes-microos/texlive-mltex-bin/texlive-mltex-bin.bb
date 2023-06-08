SUMMARY = "Binary files of mltex"
DESCRIPTION = "Binary files of mltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-mltex-bin-2023.20230311.svn3006-89.1.aarch64.rpm"
RPM_HASH = "dfb86ca107b5e95dc072b8725dd4273873858bf5c807b4ce0655a44b9f0078970ac7bfc511274eada869e53e8cc7a95da02736d142221a029dd2aa008b3cce8d"

RPROVIDES:${PN} += "texlive-mltex-bin texlive-mltex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mltex"

inherit rpm

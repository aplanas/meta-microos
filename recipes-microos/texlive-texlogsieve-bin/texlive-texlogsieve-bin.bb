SUMMARY = "Binary files of texlogsieve"
DESCRIPTION = "Binary files of texlogsieve"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61328"

RPM_NAME = "texlive-texlogsieve-bin-2023.20230311.svn61328-91.1.aarch64.rpm"
RPM_HASH = "3b64d4a5eb5080cba782a38de77bda092f8e3163021c64e8fb067668542734f47cb0e4ed52860fa13c1a295390497502e40ac8d6a82f80a6a7393a3d575aa682"

RPROVIDES:${PN} += "texlive-texlogsieve-bin \
texlive-texlogsieve-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texlogsieve"

inherit rpm

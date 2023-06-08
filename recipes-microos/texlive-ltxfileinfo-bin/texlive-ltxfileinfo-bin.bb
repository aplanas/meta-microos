SUMMARY = "Binary files of ltxfileinfo"
DESCRIPTION = "Binary files of ltxfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29005"

RPM_NAME = "texlive-ltxfileinfo-bin-2023.20230311.svn29005-89.1.aarch64.rpm"
RPM_HASH = "0d765bdc9f048559b836ecfde68056aaf815a6c0815a7f69ceedc86ceee233287ad9ba40786b8f0740ba8ea4a555b8c0ca014940b95b572f4f75716997416586"

RPROVIDES:${PN} += "texlive-ltxfileinfo-bin texlive-ltxfileinfo-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ltxfileinfo"

inherit rpm

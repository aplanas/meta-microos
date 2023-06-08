SUMMARY = "Binary files of mathspic"
DESCRIPTION = "Binary files of mathspic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23661"

RPM_NAME = "texlive-mathspic-bin-2023.20230311.svn23661-89.1.aarch64.rpm"
RPM_HASH = "a9ea922f5cba1dbf72439a3fb34f47951054b0c7d583349794bf6519a42cca8bddd89f81e94a7e5742c6b0d4e2e8ce7e4a6a6af4e05a039289ad7793a9e334b8"

RPROVIDES:${PN} += "texlive-mathspic-bin texlive-mathspic-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mathspic"

inherit rpm

SUMMARY = "Binary files of latexfileversion"
DESCRIPTION = "Binary files of latexfileversion"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25012"

RPM_NAME = "texlive-latexfileversion-bin-2023.20230311.svn25012-91.1.aarch64.rpm"
RPM_HASH = "635484bb6104305a1314e86327ff200c1fe815422a21f66e6f4f35eb1e5481b28f8ad53d240a6a5d0af6dde7fbf5450714ac035d1c29bcd3fbab08ab088523f2"

RPROVIDES:${PN} += "texlive-latexfileversion-bin \
texlive-latexfileversion-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latexfileversion"

inherit rpm

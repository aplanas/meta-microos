SUMMARY = "Binary files of accfonts"
DESCRIPTION = "Binary files of accfonts"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn12688"

RPM_NAME = "texlive-accfonts-bin-2023.20230311.svn12688-91.1.aarch64.rpm"
RPM_HASH = "9f720f69eb8d85dbb9b16d895c5f6182af1585b76e51e46489ab91f68a5d99e26044bb4eef3fecd6854acf37d4335ecb9f83d1f6d306e15d57975f85798352f9"

RPROVIDES:${PN} += "texlive-accfonts-bin texlive-accfonts-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-accfonts"

inherit rpm

SUMMARY = "Binary files of cweb"
DESCRIPTION = "Binary files of cweb"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-cweb-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "59028876cca6072ca35acbb5197d78a0dd28b5a7ed4d2a4669e7975ffe4e4e0999ef2f7c35bcf4a34770879936463f91dd0a3c3516dff1e1953bb9ba0522c271"

RPROVIDES:${PN} += "texlive-cweb-bin \
texlive-cweb-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
texlive-cweb"

inherit rpm

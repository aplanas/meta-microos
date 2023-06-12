SUMMARY = "Binary files of texplate"
DESCRIPTION = "Binary files of texplate"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53444"

RPM_NAME = "texlive-texplate-bin-2023.20230311.svn53444-91.1.aarch64.rpm"
RPM_HASH = "a40833df5ef288299c6baf6103580a2c8a18c1fb89069ced4039d113aef8f67ddf7859677ad6378476238ef78ab155391a5b41ea1301ec0b783a573e6165d4c2"

RPROVIDES:${PN} += "texlive-texplate-bin texlive-texplate-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texplate"

inherit rpm

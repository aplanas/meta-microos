SUMMARY = "Development files for jxrlib"
DESCRIPTION = "The jxrlib-devel package contains libraries and header files for \
developing applications that use jxrlib."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "jxrlib-devel-1.1-4.9.aarch64.rpm"
RPM_HASH = "19f645c648b21175b8bff8e1995c5fb969f50545786f6442a3aea71ba7be27c73c74fdf7b62817be8c9e73f7cd82545564e557976fa0ca17ebf42d0919223a06"

RPROVIDES:${PN} += "jxrlib-devel \
jxrlib-devel(aarch-64)"
RDEPENDS:${PN} += "libjpegxr0 \
libjxrglue0"

inherit rpm

SUMMARY = "Complex Textlayout Library"
DESCRIPTION = "Library that encapsulates the logic for complex \
text layout and provides a convenient API."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "libraqm0-0.10.1-1.1.aarch64.rpm"
RPM_HASH = "bf63bc6f6430f797736d0a523b91c75887fee4ce45067e2b56991f2f019e81ac0e3b1068f83a28e911786a6ed19655180253b74a4e41a6ade949764d229b6883"

RPROVIDES:${PN} += "libraqm.so.0()(64bit) \
libraqm0 \
libraqm0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfreetype.so.6()(64bit) \
libfribidi.so.0()(64bit) \
libharfbuzz.so.0()(64bit)"

inherit rpm

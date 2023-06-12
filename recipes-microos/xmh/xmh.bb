SUMMARY = "Graphical user interface to send and read mail with MH"
DESCRIPTION = "The xmh program provides a graphical user interface to the \
MH Message Handling System. To actually do things with your \
mail, it makes calls to the MH package."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "xmh-1.0.4-1.3.aarch64.rpm"
RPM_HASH = "96387716795852203dad9ad6e32b4c8da822924fde0b53cb0a478d4e3babac266dff8ba97ea90ab264fe2f5d5122c5c5e0b7b994d2e6ff0aa1a4ba18da6d560f"

RPROVIDES:${PN} += "xmh \
xmh(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
nmh"

inherit rpm

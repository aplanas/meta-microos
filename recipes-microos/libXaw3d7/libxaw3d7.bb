SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "libXaw3d7-1.6.4-1.3.aarch64.rpm"
RPM_HASH = "7c0862f12af0749786ff079cf75511f6be444fa601e8c347a350a21c9f4ee7082df1b237f04dc09e3430408f025c6ca12fd6d688b1c750cd38513d0993d76550"

RPROVIDES:${PN} += "libXaw3d.so.7()(64bit) \
libXaw3d7 \
libXaw3d7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXmu.so.6()(64bit) \
libXpm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

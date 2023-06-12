SUMMARY = "Plugin for GIMP providing support for the DDS format"
DESCRIPTION = "This GIMP plugin allows to load and save images in the Direct Draw \
Surface (DDS) format."
LICENSE = "GPL-2.0+"

PV = "3.0.1"

RPM_NAME = "gimp-plugin-dds-3.0.1-3.32.aarch64.rpm"
RPM_HASH = "c527426a296af6d1eb4600df09c08fe6a98175a6e12f2b1db0437f861701b2680ac1f96670a60cc718345809d17305658d9629986981f2c6e565c95ed2fdf44c"

RPROVIDES:${PN} += "gimp-plugin-dds \
gimp-plugin-dds(aarch-64)"
RDEPENDS:${PN} += "gimp \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgimp-2.0.so.0()(64bit) \
libgimpui-2.0.so.0()(64bit) \
libgimpwidgets-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm

SUMMARY = "RAW images thumbnailer for GNOME"
DESCRIPTION = "A lightweight and fast thumbnailer used by Nautilus for digital camera RAW files."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "raw-thumbnailer-3.0.0-12.5.aarch64.rpm"
RPM_HASH = "e9867450fbb465a6d63c3709603f2c024a0a367ec9de03a65f052c5f26530a461e88a2f9e0453c244f0333aafb959af8b9d441e53094a1a6abf10274ecca8136"

RPROVIDES:${PN} += "raw-thumbnailer \
raw-thumbnailer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libopenrawgnome.so.9()(64bit) \
shared-mime-info"

inherit rpm

SUMMARY = "Automatic archives creating and extracting library"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.4"

RPM_NAME = "libgnome-autoar-0-0-0.4.4-1.1.aarch64.rpm"
RPM_HASH = "2db830a7e38493c4312ed3b033895ff914ab898d33c6c082e9797495293a3c18539e069d6b16403a7f90168b0ed3453a7ae641331ee8408f127578564825380a"

RPROVIDES:${PN} += "libgnome-autoar-0-0 libgnome-autoar-0-0(aarch-64) libgnome-autoar-0.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.33)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm

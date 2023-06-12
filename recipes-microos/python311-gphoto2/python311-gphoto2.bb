SUMMARY = "Python interface to libgphoto2"
DESCRIPTION = "Python bindings to libgphoto2. The module is built using SWIG to \
automatically generate the interface code. This gives direct \
access to nearly all of the libgphoto2 functions, although sometimes \
in a nonstandard manner."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.4"

RPM_NAME = "python311-gphoto2-2.2.4-3.3.aarch64.rpm"
RPM_HASH = "cf6ab9746545dd1b43ea913ed01d891ec18bab42ceb791a9472fb5d1f4cb959fb8bf3b51f0377bd47bced39206e5dd5a78119e35d59b18b9c7f49f195094e7d4"

RPROVIDES:${PN} += "python3.11dist(gphoto2) \
python311-gphoto2 \
python311-gphoto2(aarch-64) \
python3dist(gphoto2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgphoto2.so.6()(64bit) \
libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) \
python(abi)"

inherit rpm

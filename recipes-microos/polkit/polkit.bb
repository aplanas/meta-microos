SUMMARY = "PolicyKit Authorization Framework"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "polkit-121-4.2.aarch64.rpm"
RPM_HASH = "72cfe65c9db49b6604762e4a5e579c9c54af1811f4fff398800853769d8d8027bc3acf1a44305ea7d48eded2e6bf19a9fc43ec8d6dab86cffa8fdab42a60e2d2"

RPROVIDES:${PN} += "group(polkitd) \
polkit \
polkit(aarch-64) \
user(polkitd)"
RDEPENDS:${PN} += "/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libduktape.so.207()(64bit) \
libexpat.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpolkit-agent-1-0 \
libpolkit-agent-1.so.0()(64bit) \
libpolkit-gobject-1-0 \
libpolkit-gobject-1.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_213)(64bit) \
permissions \
sysuser-shadow"

inherit rpm

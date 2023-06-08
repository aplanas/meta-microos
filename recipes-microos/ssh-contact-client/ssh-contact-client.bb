SUMMARY = "Tool to connect to telepathy IM contacts via SSH -- Client"
DESCRIPTION = "SSH-Contact is a client/service tool that makes it easy to connect to \
your telepathy IM contacts via SSH. No need to care about dynamic IP, \
NAT, port forwarding, or firewalls anymore; if you can chat with a \
friend, you can also SSH to their machine."
LICENSE = "GPL-2.0+"

PV = "0.7"

RPM_NAME = "ssh-contact-client-0.7-9.29.aarch64.rpm"
RPM_HASH = "1387c14e2111cd2435f07097faf94367bf16a868a9d48fddf2931695f7f3f438be2e8a2d5682f71989c683a11f5d1b8b610f0a56c2510dc5f2af35c0e500716c"

RPROVIDES:${PN} += "ssh-contact-client ssh-contact-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libtelepathy-glib.so.0()(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.12)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.3)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.0)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.10)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.2)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.5)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.0)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.17)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.18)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.26)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.29)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.9.0)(64bit)"

inherit rpm

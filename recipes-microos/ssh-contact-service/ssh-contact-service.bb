SUMMARY = "Tool to connect to telepathy IM contacts via SSH -- Server"
DESCRIPTION = "SSH-Contact is a client/service tool that makes it easy to connect to \
your telepathy IM contacts via SSH. No need to care about dynamic IP, \
NAT, port forwarding, or firewalls anymore; if you can chat with a \
friend, you can also SSH to their machine."
LICENSE = "GPL-2.0+"

PV = "0.7"

RPM_NAME = "ssh-contact-service-0.7-9.29.aarch64.rpm"
RPM_HASH = "236dc5aaaa3ee78f75ca6d28efe433c75057e0be929db95d38441d86155e040f7e21cee8c39ea856f71bcfae864061335162044eb19c4c01883f49fff70b2106"

RPROVIDES:${PN} += "ssh-contact-service ssh-contact-service(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libtelepathy-glib.so.0()(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.5)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.6)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.10)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.2)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.5)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.0)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.26)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.29)(64bit)"

inherit rpm

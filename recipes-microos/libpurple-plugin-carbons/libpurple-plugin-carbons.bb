SUMMARY = "Experimental XEP-0280: Message Carbons plugin for libpurple"
DESCRIPTION = "Experimental XEP-0280: Message Carbons plugin for libpurple \
(Pidgin, Finch, etc)."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "libpurple-plugin-carbons-0.2.2-1.15.aarch64.rpm"
RPM_HASH = "ff09075cdd25f1bdb80512bcd96218e54b24d792e65804498746d890dcc67aad46b7e8c6b2e290f9a1dc9aa6a53974313597a92cc1b3f65a45915304665f0c1e"

RPROVIDES:${PN} += "libpurple-plugin-carbons \
libpurple-plugin-carbons(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libjabber.so.0()(64bit)"

inherit rpm

SUMMARY = "Jabber Client Library Written in C"
DESCRIPTION = "Loudmouth is a lightweight and easy-to-use C library for programming \
with the Jabber protocol. It's designed to be easy to get started with \
and yet extensible to let you do anything the Jabber protocol allows."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.4"

RPM_NAME = "loudmouth-devel-1.5.4-1.7.aarch64.rpm"
RPM_HASH = "c68d7a50015ee83eb46a9c1290abc0ef04854b55fdeb6a2da6e2a58305f97a20b97091f91e1f6841b51e8bd466bd2f96cbb1906cf44125b3d83605e03f9c8b85"

RPROVIDES:${PN} += "loudmouth-devel loudmouth-devel(aarch-64) pkgconfig(loudmouth-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libloudmouth-1-0 pkgconfig(glib-2.0)"

inherit rpm

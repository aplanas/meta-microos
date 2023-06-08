SUMMARY = "A libpurple plugin to connect to Mattermost"
DESCRIPTION = "A third-party plugin for the Pidgin multi-protocol instant \
messenger. \
It connects libpurple-based instant messaging clients with the \
Mattermost server. \
 \
This package provides the protocol plugin for libpurple clients."
LICENSE = "GPL-3.0-or-later"

PV = "2.1"

RPM_NAME = "libpurple-plugin-mattermost-2.1-1.4.aarch64.rpm"
RPM_HASH = "2751ac3b00cec9207ee787b8d5a1f3b4e676fc244836c0f00f2c6f8d04ce30600bc983c076e16f76f157cdb331bd849db20721dafa68c7b8974fae55af2b330e"

RPROVIDES:${PN} += "libmattermost.so()(64bit) libpurple-plugin-mattermost libpurple-plugin-mattermost(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libmarkdown.so.3()(64bit) libpurple.so.0()(64bit)"

inherit rpm

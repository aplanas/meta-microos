SUMMARY = "Development files for sysprof-ui"
DESCRIPTION = "The sysprof-ui-devel package contains libraries and header files for \
developing applications that use sysprof-ui."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-ui-devel-3.48.0-2.1.aarch64.rpm"
RPM_HASH = "ca790359d743192c091f41e3c34b8ced2fe6c0a4e954bdb40537668149f6fa343108f6493e52278189ff32b07cffe8ff14487bd1939753306a6577b4268e6eac"

RPROVIDES:${PN} += "pkgconfig(sysprof-ui-5) sysprof-ui-devel sysprof-ui-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(gio-2.0) pkgconfig(gtk4) pkgconfig(libadwaita-1) pkgconfig(sysprof-4) sysprof-ui"

inherit rpm

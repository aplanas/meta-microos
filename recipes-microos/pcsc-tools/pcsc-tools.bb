SUMMARY = "Smart card tools"
DESCRIPTION = "These tools are used to test a PC/SC driver, card or reader \
or send commands in a friendly environment \
(text or graphical user interface)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "pcsc-tools-1.6.1-1.2.aarch64.rpm"
RPM_HASH = "d30932e8a94d160296805e7ee634651ba94a28cd82b95c13dc864ed7b7807b6c2bd57b3a83d3c74178540bcb939698c9413a64954958a99b77c93ce9b371f941"

RPROVIDES:${PN} += "pcsc-tools pcsc-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpcsclite.so.1()(64bit) perl(Glib) perl(Gtk3) perl-pcsc"

inherit rpm

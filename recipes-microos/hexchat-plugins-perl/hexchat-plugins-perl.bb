SUMMARY = "Plugin for HexChat adds support for Perl scripts"
DESCRIPTION = "The HexChat plugin providing the Perl scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-plugins-perl-2.16.1-2.4.aarch64.rpm"
RPM_HASH = "e6ed95a0913751ff5ec3bf953a743120740213baf22285ac1318163de0cd38cef34c2f75a64379a825c717df5534995d3e7fa6a0fc691e6186bfd8167975056e"

RPROVIDES:${PN} += "hexchat-plugins-perl hexchat-plugins-perl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libperl.so()(64bit) perl"

inherit rpm

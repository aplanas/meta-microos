SUMMARY = "Osmocom control interface library"
DESCRIPTION = "libosmoctrl is an SNMP-like control interface. In contrast to the VTY \
interface, the control interface is meant to be used by programs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmoctrl."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmoctrl-devel-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "11df2e700bfe12cab90fa1636a5ceca782b5636e25f4ec4decbf7dc90e7f9cb3f79561c943706c8a8bc2d57b1a748627ed0a8645c4d7b56f52b6bbd96b90a08f"

RPROVIDES:${PN} += "libosmoctrl-devel libosmoctrl-devel(aarch-64) pkgconfig(libosmoctrl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocore-devel libosmoctrl0 libosmovty-devel pkgconfig(libosmocore) pkgconfig(libosmogsm) pkgconfig(talloc)"

inherit rpm

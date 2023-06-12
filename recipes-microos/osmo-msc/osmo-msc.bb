SUMMARY = "Osmocom's MSC for 2G and 3G circuit-switched mobile networks"
DESCRIPTION = "The Mobile Switching Center (MSC) is the heart of 2G/3G \
circuit-switched services.  It terminates the A-interface links from the \
Base Station Controllers (BSC) and handles the MM and CC sub-layers of \
the Layer 3 protocol from the phones (MS). \
 \
This Osmocom implementation of the MSC handles A interfaces via 3GPP \
AoIP in an ASP role.  It furthermore implements IETF MGCP against an \
external media gateway, such as OsmoMGW.  It does *not* implement MAP \
towards a HLR, but the much simpler Osmocom GSUP protocol, which can \
be translated to MAP if needed."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "osmo-msc-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "0b436b0cd2e4b86da005b3ebc42ab4c626015af80465fed9c04c9bf22d8910e471d02305c3b51bf97d5cb5a99cad759c2a2d9682f3a511003b86a0b5af797d55"

RPROVIDES:${PN} += "config(osmo-msc) osmo-msc osmo-msc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasn1c.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbi.so.3()(64bit) libdbi.so.3(ABI_3)(64bit) libosmo-gsup-client.so.0()(64bit) libosmo-mgcp-client.so.9()(64bit) libosmo-ranap.so.7()(64bit) libosmo-sigtran.so.7()(64bit) libosmocore.so.20()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmonetif.so.11()(64bit) libosmovty.so.9()(64bit) libsctp.so.1()(64bit) libsctp.so.1(VERS_1)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) systemd"

inherit rpm

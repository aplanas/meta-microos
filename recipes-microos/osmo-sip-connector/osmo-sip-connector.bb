SUMMARY = "MNCC to SIP bridge for osmo-nitb"
DESCRIPTION = "Use the osmo-nitb MNCC interface and bridge it to SIP."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "osmo-sip-connector-1.6.0-1.9.aarch64.rpm"
RPM_HASH = "af967a7cfd32a4466c952e1a940bb1bd472822d3ebe574afb4cee1a64b5ebbfb3d99b4966c755df5f2223c8a6c80f01be35496e608755e3311f5896698723926"

RPROVIDES:${PN} += "config(osmo-sip-connector) osmo-sip-connector osmo-sip-connector(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libsofia-sip-ua-glib.so.3()(64bit) libsofia-sip-ua.so.0()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) systemd"

inherit rpm

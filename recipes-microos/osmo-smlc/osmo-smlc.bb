SUMMARY = "Osmocom Serving Mobile Location Centre"
DESCRIPTION = "OsmoSMLC is the Osmocom Serving Mobile Location Centre. It implements \
the SMLC functionality as specified in 3GPP networks \
Location_Services architecture."
LICENSE = "AGPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "osmo-smlc-0.2.2-1.4.aarch64.rpm"
RPM_HASH = "b0f6b6676f7754654ce4e1e4209323d6cf42014fd38cd05225d10dceb93984fdb29641121af2f99f544e46732d823849cede161968ab07c5d29d33b617cc067c"

RPROVIDES:${PN} += "osmo-smlc osmo-smlc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-sigtran.so.7()(64bit) libosmocore.so.19()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm

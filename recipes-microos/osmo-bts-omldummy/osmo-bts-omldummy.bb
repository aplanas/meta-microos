SUMMARY = "Osmocom CI: Bring up only OML without RSL"
DESCRIPTION = "This is used only in integration testing, where in the TTCN-3 testsuite \
we currently have no A-bis OML implementation, but only a RSL one."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-bts-omldummy-1.4.0-1.9.aarch64.rpm"
RPM_HASH = "5daab362b7231d25055d9c7d0eb756bf88ca9bd4cb50efa788626f2d0dd135cf6c11ba338ae5a541247ef77671c98676b8b97afee046d84deb6bada1e813634f"

RPROVIDES:${PN} += "osmo-bts-omldummy osmo-bts-omldummy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmotrau.so.2()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm

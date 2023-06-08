SUMMARY = "Osmocom's SGSN for 2G and 3G packet-switched mobile networks"
DESCRIPTION = "OsmoSGSN is Osmocom's Serving GPRS Support Node for 2G and 3G \
packet-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-sgsn-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "461fcb636fe3f1117ceeab10510825ee9e2e05a788aa5808362d8ccf766238a22cd54a2ddb1f60c52305eb658f9be18697023c6bf3f129ce009206d3fd7fe539"

RPROVIDES:${PN} += "config(osmo-sgsn) osmo-sgsn osmo-sgsn(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libgtp.so.6()(64bit) libosmo-gsup-client.so.0()(64bit) libosmo-ranap.so.5()(64bit) libosmo-sigtran.so.7()(64bit) libosmocore.so.19()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogb.so.14()(64bit) libosmogb.so.14(LIBOSMOGB_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) systemd"

inherit rpm

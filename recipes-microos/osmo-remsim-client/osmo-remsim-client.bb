SUMMARY = "Osmocom Remote SIM Client"
DESCRIPTION = "The remsim-client is managing a given phone/modem. It attaches to the \
'cardem' firmware of a SIMtrcace2 (or compatible, such as sysmoQMOD) \
hardware and forwards the SIM card communication to a remsim-bankd, \
under the control of remsim-server."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "osmo-remsim-client-0.2.2-1.21.aarch64.rpm"
RPM_HASH = "d434b766e598c2e033804e7f9f90e4e278e65e871330459466091db32711545c2863822dcaef1605bae5fdae4117c8cdccec06ee05a25139f13d9f1898b6fd5e"

RPROVIDES:${PN} += "osmo-remsim-client osmo-remsim-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-rspro.so.1()(64bit) libosmoabis.so.10()(64bit) libosmocore.so.20()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmosim.so.2()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm

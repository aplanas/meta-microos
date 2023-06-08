SUMMARY = "Osmocom Remote SIM Central Server"
DESCRIPTION = "The remsim-server is the central element of a osmo-remsim deployment, \
it maintains a list of clients + bankds connected to it, as well as the \
dynamic SIM card mappings between them."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "osmo-remsim-server-0.2.2-1.20.aarch64.rpm"
RPM_HASH = "abb9dec1fb280a4d480618b0188dd428352ac4ac104769307f0bf4083de11c17a8376ad2ee846ea637c9b5f5c8712eb124560092269cf5b415c54793484f3b35"

RPROVIDES:${PN} += "osmo-remsim-server osmo-remsim-server(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) liborcania.so.2.3()(64bit) libosmo-rspro.so.1()(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libulfius.so.2.7()(64bit)"

inherit rpm

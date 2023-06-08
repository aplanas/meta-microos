SUMMARY = "Osmocom SIGTRAN STP (Signaling Transfer Point)"
DESCRIPTION = "This is the Osmocom (Open Source Mobile Communications) \
implementation of a Signaling Transfer Point (STP) for SS7/SIGTRAN \
telecommunication networks. At this point, it is a minimal \
implementation, missing lots of the functionality usually present in \
a STP, such as Global Title Routing, Global Title Translation."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "osmo-stp-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "a51dc122222786c551f1342910fdf1e18d97d4ec7c295d88fcebd666d3482f2f83bac43582f054efd2fcc607e6ea217fa19e464e8e139e05c19ce78635f86db6"

RPROVIDES:${PN} += "config(osmo-stp) osmo-stp osmo-stp(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-sigtran.so.7()(64bit) libosmocore.so.19()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm

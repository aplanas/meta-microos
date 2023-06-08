SUMMARY = "Osmocom GSM A-bis interface library"
DESCRIPTION = "In the GSM system architecture, A-bis is a Base Station \
System-internal interface linking the Base Transceiver Stations (BTS) \
and Base Station Controller (BSC). This interface allows control of \
the radio equipment and radio frequency allocation in the BTS. \
 \
This library contains common/shared code regarding this A-bis \
interface. It also implements drivers for mISDN and DAHDI-based E1 \
cards, as well as some A-bis/IP dialects."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmoabis10-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "192111084ef59b1747576f6c39d01b50d0fb62b1152a40a9365977e26be56d3b577de7836362163a0285c48b5875bc42a5291413c5fd598893a56a0d19d6c5c2"

RPROVIDES:${PN} += "libosmoabis.so.10()(64bit) libosmoabis10 libosmoabis10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmo-e1d.so.1()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm

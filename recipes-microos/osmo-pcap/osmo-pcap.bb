SUMMARY = "Osmocom's PCAP client and server"
DESCRIPTION = "Osmocom tools to help with pcap tracing. \
Run osmo_pcap_client locally and send traces to a different system."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "0.1.3"

RPM_NAME = "osmo-pcap-0.1.3-1.9.aarch64.rpm"
RPM_HASH = "ac471be008b1209b5ed7c53038410d24c98979154a70a3d3deaf775926c0e0d8f58c06d84ab4408ceb6c78972ff783cedccff4698714f0df06fcaedb3afc20de"

RPROVIDES:${PN} += "config(osmo-pcap) osmo-pcap osmo-pcap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libpcap.so.1()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libzmq.so.5()(64bit)"

inherit rpm

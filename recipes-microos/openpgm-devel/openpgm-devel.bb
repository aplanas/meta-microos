SUMMARY = "Development files for the OpenPGM Reliable Multicast Protocol library"
DESCRIPTION = "OpenPGM is an implementation of the Pragmatic General Multicast (PGM) \
specification in RFC 3208. PGM is a reliable and scalable multicast protocol \
that enables receivers to detect loss, request retransmission of lost data, or \
notify an application of unrecoverable loss. \
 \
This subpackage contains the header files for OpenPGM."
LICENSE = "LGPL-2.1-or-later"

PV = "5.2.122"

RPM_NAME = "openpgm-devel-5.2.122-10.8.aarch64.rpm"
RPM_HASH = "da0f166fb2eee7310267e748d79ac49813cc1c57879c60d7a36885e3a1c6f83ce72e412be051894c303b5d1aa1ca5f30014f46c6a55e8022dfa4e22562ad55af"

RPROVIDES:${PN} += "openpgm-devel openpgm-devel(aarch-64) pkgconfig(openpgm-5.2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpgm-5_2-0"

inherit rpm

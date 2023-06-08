SUMMARY = "Development headers for scamper's binary dump file access library"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains development headers and other ancillary files for the \
libscamperfile library."
LICENSE = "GPL-2.0-only"

PV = "20230302"

RPM_NAME = "libscamperfile-devel-20230302-1.3.aarch64.rpm"
RPM_HASH = "afe951c92b062343493bbb64c96f94403a6ff3db4578d6023991789ac7386577596185763c08b88521fa216a9770c529e84e1bee1ecb0e863cbfcaf1ca652a9d"

RPROVIDES:${PN} += "libscamperfile-devel libscamperfile-devel(aarch-64)"
RDEPENDS:${PN} += "libscamperfile5"

inherit rpm

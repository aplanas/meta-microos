SUMMARY = "A tool to measure network performance"
DESCRIPTION = "Iperf is a tool for active measurements of the maximum achievable bandwidth \
on IP networks. It supports tuning of various parameters related to timing, \
protocols, and buffers. For each test it reports the bandwidth, loss, and \
other parameters. \
 \
This package contains development files."
LICENSE = "BSD-3-Clause"

PV = "3.13"

RPM_NAME = "iperf-devel-3.13-1.2.aarch64.rpm"
RPM_HASH = "c3ef4ed01d26de17598fb1bf7a2c30efc652e8ce35ac8d70d4c66d17f75906ad25350d0089a328466d4608d96d970e04ee832972d560a5300799b776a13694a9"

RPROVIDES:${PN} += "iperf-devel iperf-devel(aarch-64)"
RDEPENDS:${PN} += "libiperf0 pkgconfig(uuid)"

inherit rpm

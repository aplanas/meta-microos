SUMMARY = "Development headers for scamper's control library"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains development headers and other ancillary files for the \
libscamperctrl library."
LICENSE = "GPL-2.0-only"

PV = "20230302"

RPM_NAME = "libscamperctrl-devel-20230302-1.3.aarch64.rpm"
RPM_HASH = "26383f4aa945220afddc366dcf1e27ac3ab3fd3e59fdc0bb2e2225ea94acdea87d1e5f2fc3b62068f196f6fdf426b1b413f90079d0770d220448c8a63582380c"

RPROVIDES:${PN} += "libscamperctrl-devel \
libscamperctrl-devel(aarch-64)"
RDEPENDS:${PN} += "libscamperctrl1"

inherit rpm

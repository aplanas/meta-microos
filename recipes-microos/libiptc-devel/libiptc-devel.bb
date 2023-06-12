SUMMARY = "Development files for libiptc, a packet filter ruleset library"
DESCRIPTION = "libiptc ('iptables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libiptc-devel-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "a6a0ab19f3075f62da9c55bc5103dfa15ab312a7ff1cf132ebf689c948787e2c6a621e806e6f4a636b622eee6c30ffe2b2416e8797c8e3fb457fa2105ca57032"

RPROVIDES:${PN} += "libiptc-devel \
libiptc-devel(aarch-64) \
pkgconfig(libip4tc) \
pkgconfig(libip6tc) \
pkgconfig(libiptc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libip4tc2 \
libip6tc2 \
pkgconfig(libip4tc) \
pkgconfig(libip6tc)"

inherit rpm

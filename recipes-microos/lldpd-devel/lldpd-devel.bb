SUMMARY = "Headers for the lldpd implementation"
DESCRIPTION = "This package is required to develop alternate clients for lldpd. \
 \
LLDP is an industry standard protocol designed to supplant proprietary \
Link-Layer protocols such as Extreme EDP (Extreme Discovery Protocol) \
and CDP (Cisco Discovery Protocol). The goal of LLDP is to provide an \
inter-vendor compatible mechanism to deliver Link-Layer notifications \
to adjacent network devices."
LICENSE = "MIT"

PV = "1.0.16"

RPM_NAME = "lldpd-devel-1.0.16-1.4.aarch64.rpm"
RPM_HASH = "ac97da24bd05df1677bb7446f99d3d3c9cebb1b623274c5967b7ce7f0e76d63425b05bbb1e8ce48615f6f818a379b48718300915ff6192f8301d62edc355946e"

RPROVIDES:${PN} += "lldpd-devel lldpd-devel(aarch-64) pkgconfig(lldpctl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblldpctl4"

inherit rpm

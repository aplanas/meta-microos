SUMMARY = "Development Files for HPI"
DESCRIPTION = "Contains additional files needed for a developer to create applications \
and/or middleware that use the Service Availability Forum's HPI \
specification."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-devel-3.8.0.ge4631e8a-3.4.aarch64.rpm"
RPM_HASH = "1226a86042c8d2936d703a44afd9b3f6512ce7f91cb1e2c89a669c25bb399a431853b72c5e3285c0101413e01384806bc10feadf270f022c99a9c25a329b005b"

RPROVIDES:${PN} += "openhpi-devel openhpi-devel(aarch-64) pkgconfig(openhpi) pkgconfig(openhpiutils)"
RDEPENDS:${PN} += "/usr/bin/pkg-config OpenIPMI-devel bzip2 e2fsprogs-devel gdbm-devel glib2-devel glibc-devel libopenhpi4 libstdc++-devel libtool ncurses-devel net-snmp-devel pkgconfig(glib-2.0) pkgconfig(openssl) popt-devel zlib-devel"

inherit rpm

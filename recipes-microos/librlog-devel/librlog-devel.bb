SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "librlog-devel-1.4-19.4.aarch64.rpm"
RPM_HASH = "929dab1136b65b71618beb6a2b37238fe18dea9dd7197f2d3047c11ed1eee4786803a468b73ba7d5c9254277e7fd6c119d7ebab8c71d9643eea51a1af1967ce1"

RPROVIDES:${PN} += "librlog-devel librlog-devel(aarch-64) pkgconfig(librlog) rlog-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config librlog5 libstdc++-devel"

inherit rpm

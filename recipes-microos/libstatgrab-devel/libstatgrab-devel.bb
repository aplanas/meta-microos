SUMMARY = "Development Environment for libstatgrab"
DESCRIPTION = "Development environment for libstatgrab (headers, library links, static library)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.92.1"

RPM_NAME = "libstatgrab-devel-0.92.1-1.6.aarch64.rpm"
RPM_HASH = "16d4d0591549877128a1716ec9569c885afa9edecd513204f4705f5e159af00817e9e1b74df948821bc568dad015ea25e8f4c134cb19cb2e309f2e70f822b73d"

RPROVIDES:${PN} += "libstatgrab-devel libstatgrab-devel(aarch-64) pkgconfig(libstatgrab)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libstatgrab10"

inherit rpm

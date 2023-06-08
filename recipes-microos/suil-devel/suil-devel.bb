SUMMARY = "Development files for the suil library"
DESCRIPTION = "Development files needed to build applications against suil library."
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-devel-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "400731e5d695362068b7e7e64c30f19745bcf0634896b05942d3bccb151709c05603679ebf7208c8b8311f48b27de9948090e3e941f16d4d31358caa631c7a80"

RPROVIDES:${PN} += "pkgconfig(suil-0) suil-devel suil-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsuil-0-0 pkgconfig pkgconfig(lv2)"

inherit rpm

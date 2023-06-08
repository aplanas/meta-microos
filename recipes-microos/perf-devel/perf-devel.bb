SUMMARY = "Development headers for perf"
DESCRIPTION = "Development headers for perf. This is currently only dlfilter header."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "perf-devel-6.3.1-79.18.aarch64.rpm"
RPM_HASH = "69b869c6f26a8ad3bfb436566a5e3400256b2f7076fb0ef259ed664324619df55fb6a4990d8572391eccfb78427d88fa9675d339e5a5a3b8c2c4c57f630187f7"

RPROVIDES:${PN} += "perf-devel perf-devel(aarch-64)"
RDEPENDS:${PN} += "perf"

inherit rpm

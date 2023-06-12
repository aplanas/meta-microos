SUMMARY = "Development headers for perf"
DESCRIPTION = "Development headers for perf. This is currently only dlfilter header."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "perf-devel-6.3.4-80.3.aarch64.rpm"
RPM_HASH = "f8b3935c8841beb804cbef6fbbcaec0572f7484ea8e7f4a18f2151c0a425e15361d96d57a0cd7fcb02a6ffec2f650f0a9e4c7ae15bf5067e6c5c3cf720c37306"

RPROVIDES:${PN} += "perf-devel \
perf-devel(aarch-64)"
RDEPENDS:${PN} += "perf"

inherit rpm

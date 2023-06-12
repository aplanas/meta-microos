SUMMARY = "Empty package to ensure rebuilding perf in OBS"
DESCRIPTION = "This is an empty package that ensures perf is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "perf-rebuild-6.3.4-80.3.aarch64.rpm"
RPM_HASH = "6822ecbf8ecb3f87ba823848907a1c020e733be2d592e1070735603044aca314b70e869bc3e1b4ddd9654f0f16fe67a57eb8087b02e065968d15cbcb9008c9b0"

RPROVIDES:${PN} += "perf-rebuild perf-rebuild(aarch-64)"
RDEPENDS:${PN} += "kernel-source"

inherit rpm

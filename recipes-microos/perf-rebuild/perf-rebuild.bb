SUMMARY = "Empty package to ensure rebuilding perf in OBS"
DESCRIPTION = "This is an empty package that ensures perf is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "perf-rebuild-6.3.1-79.18.aarch64.rpm"
RPM_HASH = "fea139d063228c60b3419d63d94704579821da9a0bd42e1c2a23d17b633f2167fe64e03db1da626a5721f4c2cc17e526e69dc56d84540a89d46e8e7da9d83e36"

RPROVIDES:${PN} += "perf-rebuild perf-rebuild(aarch-64)"
RDEPENDS:${PN} += "kernel-source"

inherit rpm

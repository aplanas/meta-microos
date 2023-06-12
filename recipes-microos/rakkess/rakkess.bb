SUMMARY = "Utility to show an access matrix for k8s server resources"
DESCRIPTION = "rakkess lists access rights for the current user and all server resources \
on a provided kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "rakkess-0.5.1-1.4.aarch64.rpm"
RPM_HASH = "a27f2b02994baa09fae79f66407e858e8e86d7e42645f79c2282a1bcd1e14ab5cc67195c32f56f60ecfd774b86d65cd09f1b06297eed1be172de98a90c52e949"

RPROVIDES:${PN} += "rakkess rakkess(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

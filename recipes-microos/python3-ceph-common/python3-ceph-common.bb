SUMMARY = "Python 3 utility libraries for Ceph"
DESCRIPTION = "This package contains data structures, classes and functions used by Ceph. \
It also contains utilities used for the cephadm orchestrator."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "python3-ceph-common-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "583cd3ff647fd0ce4318eb202d1a2bb4544ae2ffd6b2d70f4f041f5e4ae2abb48c2058643a401d17ba3e7263fa4c3d3c38ed433c8da995414e75b0334fa78a6b"

RPROVIDES:${PN} += "python3-ceph-common python3-ceph-common(aarch-64) python3.10dist(ceph) python3dist(ceph)"
RDEPENDS:${PN} += "python(abi) python3-PyYAML"

inherit rpm

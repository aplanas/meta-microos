SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python39-jaraco.stream-3.0.3-2.1.noarch.rpm"
RPM_HASH = "e4970015c399539e0372b91bf21769c943b4cb5d05acce5927c059aa06f696d8c223fa46864627b43b7ddc20afd87f0ea10d88780f6feac6373e932b7d53bd03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.stream) python39-jaraco.stream python3dist(jaraco.stream)"
RDEPENDS:${PN} += "python(abi) python39-more-itertools"

inherit rpm

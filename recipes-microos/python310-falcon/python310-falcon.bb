SUMMARY = "A web framework for building APIs and app backends"
DESCRIPTION = "Falcon is a Python framework for building cloud \
APIs. It encourages the REST architectural style, and tries to do \
as little as possible while remaining effective."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python310-falcon-3.1.1-1.4.noarch.rpm"
RPM_HASH = "1532d503fb3a87c1e2d171690c01d683aca22c7ef9a5bfc73ae5c95d8c43909448778f25e49a53ed38e161d5bb6fb69a4f076e9c8e95aae3f1247acfbf50cadb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-falcon \
python3.10dist(falcon) \
python310-falcon \
python3dist(falcon)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm

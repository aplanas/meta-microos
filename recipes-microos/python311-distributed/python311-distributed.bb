SUMMARY = "Library for distributed computing with Python"
DESCRIPTION = "Dask.distributed is a library for distributed computing in Python. It \
extends both the concurrent.futures and dask APIs to moderate sized \
clusters."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python311-distributed-2023.3.2-2.1.noarch.rpm"
RPM_HASH = "565c995826cba8afa4fedda5b08465852c117b2a4aa29309df8e168025e80e344707277da959837a54c0265db4d5e9cc43dc017dac5406a737ec19c1bbebcf62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(distributed) \
python311-distributed \
python3dist(distributed)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Jinja2 \
python311-PyYAML \
python311-click \
python311-cloudpickle \
python311-dask \
python311-locket \
python311-msgpack \
python311-packaging \
python311-psutil \
python311-sortedcontainers \
python311-tblib \
python311-toolz \
python311-tornado \
python311-urllib3 \
python311-zict \
update-alternatives"

inherit rpm

SUMMARY = "Threading and multiprocessing eye-candy for Python"
DESCRIPTION = "Pebble provides an API to manage threads and processes within an application. \
It wraps Python’s standard library threading and multiprocessing objects."
LICENSE = "LGPL-3.0-only"

PV = "5.0.3"

RPM_NAME = "python311-Pebble-5.0.3-1.3.noarch.rpm"
RPM_HASH = "6a84d076adeca01ba0fa41806e8fb981f5a157808ea0edf422909b96081aee52351b6fd489922d99bf0231c96283f6d8645a6b29569d78080c2c82726e857950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pebble) python311-Pebble python3dist(pebble)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

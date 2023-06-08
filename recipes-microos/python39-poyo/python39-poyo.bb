SUMMARY = "YAML Parser for Python"
DESCRIPTION = "A YAML Parser for Python. \
 \
Please note that Poyo supports only a chosen subset of the YAML format. \
 \
It can only read but not write and is not compatible with JSON. \
 \
Poyo does not allow deserialization of arbitrary Python objects. Supported \
types are str, bool, int, float, NoneType as well as dict and list values."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-poyo-0.5.0-1.14.noarch.rpm"
RPM_HASH = "01c45dd3b1d4477cacf5b6ba7fa015caaec964d68df79c9a3a68ba3a8e6734c1222518dcafef5d78cb81decda9d25fe128232b8e907205c1b9cab721bd9658ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(poyo) python39-poyo python3dist(poyo)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

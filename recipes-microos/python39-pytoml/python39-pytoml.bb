SUMMARY = "TOML-0.4.0 parser/writer for Python"
DESCRIPTION = "A specs-conforming and strict parser and writer for TOML files. \
The library currently supports version 0.4.0 of the specs. \
 \
The pytoml project is no longer being actively maintained. \
Consider using the toml package instead."
LICENSE = "MIT"

PV = "0.1.21"

RPM_NAME = "python39-pytoml-0.1.21-3.1.noarch.rpm"
RPM_HASH = "662dfc67c95246f1562fab69d5814cb3fc378a855cd54dd5a7bcd598360d6824ca098731022397f5cfb5a7be2cfff8139ffbbac5dfb2d39de3d53ffc11a92a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytoml) python39-pytoml python3dist(pytoml)"
RDEPENDS:${PN} += "python(abi) python39"

inherit rpm

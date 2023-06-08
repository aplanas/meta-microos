SUMMARY = "Python JSON decoder that can extract data from dirty input"
DESCRIPTION = "JSON decoder for Python that can extract data from dirty input."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python39-dirtyjson-1.0.8-1.3.noarch.rpm"
RPM_HASH = "89c49b4de31f962c32058d83a92d87162e58992a7fbeda9c97d237df58aa143b7eb35abc524bee948859ded3dad42e7ecf9810db153442e4f46dae05f2ea648f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dirtyjson) python39-dirtyjson python3dist(dirtyjson)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

SUMMARY = "Advanced Python dictionaries with dot notation access"
DESCRIPTION = "Advanced Python dictionaries with dot notation access"
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python39-python-box-6.1.0-1.3.noarch.rpm"
RPM_HASH = "b8be7e112f5da681f151f408fd4878ef12023eeed612bbafb71d674b4522a23a272a5eae7a578aa80e0ccb45c04815418ba365cfcf683be36c4d6610ee9aa550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-box) python39-python-box python3dist(python-box)"
RDEPENDS:${PN} += "python(abi) python39-msgpack python39-ruamel.yaml python39-toml"

inherit rpm

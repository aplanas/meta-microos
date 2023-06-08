SUMMARY = "Compatibility shims for pip versions 8 thru current"
DESCRIPTION = "Compatibility shims for pip versions 8 thru current."
LICENSE = "ISC"

PV = "0.7.3"

RPM_NAME = "python39-pip-shims-0.7.3-1.3.noarch.rpm"
RPM_HASH = "417f29c8f48ed227c011bb9d4110bf05340216cb7d61fb9c84bb0b47a36125e94471ad7f52a8cc77876259d9379c4d1d7437b6060bcc35789b776c2db2c83d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pip-shims) python39-pip-shims python3dist(pip-shims)"
RDEPENDS:${PN} += "python(abi) python39-pip python39-setuptools python39-wheel"

inherit rpm

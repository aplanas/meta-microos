SUMMARY = "Python module to capture stdout, stderr"
DESCRIPTION = "A Python module to capture stdout, stderr with iocapture."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-iocapture-0.1.2-2.14.noarch.rpm"
RPM_HASH = "6e51b0b58ecfdec7560c3e0ee2082caabb63729827be8773c230928e5b93af8c65c739aedc1594c9f51182b2cc295c19c2450c0ea6cd67cb747bc4aabac40544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iocapture \
python3.10dist(iocapture) \
python310-iocapture \
python3dist(iocapture)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

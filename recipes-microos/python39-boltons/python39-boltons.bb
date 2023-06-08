SUMMARY = "The 'Boltons' utility package for Python"
DESCRIPTION = "Boltons is a package containing over 160 utility types and functions \
that can be used as a package or independently. Documentation is on \
http://boltons.readthedocs.org."
LICENSE = "BSD-3-Clause"

PV = "21.0.0"

RPM_NAME = "python39-boltons-21.0.0-2.3.noarch.rpm"
RPM_HASH = "1d2e2b32dbc2051077588fa730467faa7018051a46aad89ae2746711946c9971aabf7727da487b70721a48f2cd43c6e8037d73f83f6bd6923adb85afa2b1d7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(boltons) python39-boltons python3dist(boltons)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

SUMMARY = "Helper to build testable command line interfaces"
DESCRIPTION = "CliKit is a group of utilities to build beautiful and testable \
command line interfaces."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-clikit-0.6.2-2.16.noarch.rpm"
RPM_HASH = "50074d17ba4be263631f3ab130a3602771d87cc4e61dfa28312f2adf011f955cc4b60bb8acc6b966dd3d1a0b6e5e2e1f7ac8a1b2e66ca8b6c5e4516e854b1b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(clikit) \
python39-clikit \
python3dist(clikit)"
RDEPENDS:${PN} += "python(abi) \
python39-crashtest \
python39-pastel \
python39-pylev"

inherit rpm

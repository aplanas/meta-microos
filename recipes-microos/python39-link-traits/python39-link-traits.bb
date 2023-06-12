SUMMARY = "A fork to traitlets' link and dlink to link traits in addition to traitlets"
DESCRIPTION = "A fork to traitlets' link and dlink to link traits in addition to traitlets."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python39-link-traits-1.0.3-1.11.noarch.rpm"
RPM_HASH = "ad07ca98752cdc14afedcb79c5064baeea5d5462d63c04462045e279a35dbde215807ab7596d714d43fa192422632f2daf544307dc0b56bb9dac32802376bec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(link-traits) \
python39-link-traits \
python3dist(link-traits)"
RDEPENDS:${PN} += "python(abi) \
python39-traits"

inherit rpm

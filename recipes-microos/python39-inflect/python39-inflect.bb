SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python39-inflect-5.0.2-3.1.noarch.rpm"
RPM_HASH = "c347ea191042d52843b454b8d4e7b8e91a6332796497afdcb6c0b477f5cedb1a08a991279f477960705d237626dcff693c46bda4655b6578194e71b76a2d8faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(inflect) python39-inflect python3dist(inflect)"
RDEPENDS:${PN} += "python(abi) python39-toml"

inherit rpm

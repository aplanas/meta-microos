SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python310-inflect-5.0.2-3.1.noarch.rpm"
RPM_HASH = "5298893b6010e91e8494ca95c909b5ddb76a1870a906be8e139fa6b399b202497a408213bd80f6768d3133bf815ccd8d97f0f3933a43b77cfc208d0bb2b656da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inflect python3.10dist(inflect) python310-inflect python3dist(inflect)"
RDEPENDS:${PN} += "python(abi) python310-toml"

inherit rpm

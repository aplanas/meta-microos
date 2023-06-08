SUMMARY = "Methods for working on numbers and nouns"
DESCRIPTION = "Correctly generate plurals, singular nouns, ordinals, indefinite articles; convert numbers to words."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python311-inflect-5.0.2-3.1.noarch.rpm"
RPM_HASH = "c2aaec936ba04a5d5073e2e1f57716f390448edc4f62fc7eebb709ad15c0646742a223953a62e0c682d874e5813b6febbc25f073235cb791114af01fdd66419a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(inflect) python311-inflect python3dist(inflect)"
RDEPENDS:${PN} += "python(abi) python311-toml"

inherit rpm

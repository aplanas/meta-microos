SUMMARY = "A dot-accessible dictionary"
DESCRIPTION = "A dot-accessible dictionary (a la JavaScript objects)."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-munch-2.5.0-2.1.noarch.rpm"
RPM_HASH = "815d5bc3993083ad349f847aba965da27afb629e0d9d755d1e1a9f8657ef8d733f6620a351956fb7d297b1a16c519553b50ee5abe3f04f1f41bf069bb2ccbfb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-munch python3.10dist(munch) python310-munch python3dist(munch)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm

SUMMARY = "A Python module to bypass Cloudflare's anti-bot page"
DESCRIPTION = "A Python module to bypass Cloudflare's anti-bot page."
LICENSE = "MIT"

PV = "1.2.58"

RPM_NAME = "python39-cloudscraper-1.2.58-3.11.noarch.rpm"
RPM_HASH = "d2634bb1b51bc475c30801d635f2a23ed111278de25881b9266ac58902e6bcf2c0593b30ccd4e0361e857509d59f27fd646afe433b88aee48f38534172cca847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cloudscraper) python39-cloudscraper python3dist(cloudscraper)"
RDEPENDS:${PN} += "python(abi) python39-pyparsing python39-requests python39-requests-toolbelt"

inherit rpm

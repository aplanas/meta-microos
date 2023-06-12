SUMMARY = "Core Schema for Core API"
DESCRIPTION = "Core Schema for Core API, a format-independent Document Object Model for \
representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "0.0.4"

RPM_NAME = "python310-coreschema-0.0.4-1.16.noarch.rpm"
RPM_HASH = "46568ef9f48630527bf0272567c68c2e9e00fcaeaae4b58c7d41e6bb6ab74b810c9d398664b9825ddaf249252f48d227f774485891b960194d53ea5b6e740650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coreschema \
python3.10dist(coreschema) \
python310-coreschema \
python3dist(coreschema)"
RDEPENDS:${PN} += "python(abi) \
python310-Jinja2"

inherit rpm

SUMMARY = "Core Schema for Core API"
DESCRIPTION = "Core Schema for Core API, a format-independent Document Object Model for \
representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "0.0.4"

RPM_NAME = "python39-coreschema-0.0.4-1.16.noarch.rpm"
RPM_HASH = "110211cbb9fbf1accf91a2888531cc1a5a6bac9e3e8cacd0af387313c86d76091748ccadf2d1909cc1bd032cc6e8ac38ae008f102d49363c155032762c2ae42b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(coreschema) python39-coreschema python3dist(coreschema)"
RDEPENDS:${PN} += "python(abi) python39-Jinja2"

inherit rpm

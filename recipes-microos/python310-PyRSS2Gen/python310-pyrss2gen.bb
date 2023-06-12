SUMMARY = "Generate RSS2 using a Python data structure"
DESCRIPTION = "A Python library for generating RSS 2.0 feeds."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python310-PyRSS2Gen-1.1-2.13.noarch.rpm"
RPM_HASH = "52977f15d3ce7a7c283fa20537af1cbf395f8a7938814f176606b99dc2d5418d253f15279235ea6ff0eaad08cdf34859216250c4898946671a62ecf852864e1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyrss2gen \
python3-PyRSS2Gen \
python3.10dist(pyrss2gen) \
python310-PyRSS2Gen \
python3dist(pyrss2gen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

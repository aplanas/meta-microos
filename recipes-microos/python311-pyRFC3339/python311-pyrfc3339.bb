SUMMARY = "Generate and parse RFC 3339 timestamps"
DESCRIPTION = "pyRFC3339 parses and generates :RFC:`3339`-compliant timestamps using Python `datetime.datetime` objects."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python311-pyRFC3339-1.1-3.8.noarch.rpm"
RPM_HASH = "8dbb87eb76a35cac234d18b69a965840f363d8110e1dbad71ab147afc77b430c59d5a901a4c6aac2146d43d3e5d54671e86904bfb46eaf6fde93bb5ee0659984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyrfc3339) python311-pyRFC3339 python3dist(pyrfc3339)"
RDEPENDS:${PN} += "python(abi) python311-pytz"

inherit rpm

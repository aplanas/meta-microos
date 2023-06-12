SUMMARY = "Generate and parse RFC 3339 timestamps"
DESCRIPTION = "pyRFC3339 parses and generates :RFC:`3339`-compliant timestamps using Python `datetime.datetime` objects."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python39-pyRFC3339-1.1-3.8.noarch.rpm"
RPM_HASH = "d8cd8d5822d2e31009ccec8956790e372d0c8e98b786745b2e5ff4429cde5d0bcf181ce9bb50a7e423b95bf21156ac7593641aee062866a2fda7e28275946de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyrfc3339) \
python39-pyRFC3339 \
python3dist(pyrfc3339)"
RDEPENDS:${PN} += "python(abi) \
python39-pytz"

inherit rpm

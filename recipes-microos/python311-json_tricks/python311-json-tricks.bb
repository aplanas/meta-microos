SUMMARY = "Extra features for Python's JSON"
DESCRIPTION = "The json_tricks package brings several pieces of functionality to \
python handling of json files: \
 \
1. Store and load numpy arrays in human-readable format. \
2. Store and load class instances both generic and customized. \
3. Store and load date/times as a dictionary (including timezone). \
4. Preserve map order {} using OrderedDict. \
5. Allow for comments in json files by starting lines with #. \
6. Sets, complex numbers, Decimal, Fraction, enums, compression, duplicate keys, ... \
 \
As well as compression and disallowing duplicate keys."
LICENSE = "BSD-3-Clause"

PV = "3.15.5"

RPM_NAME = "python311-json_tricks-3.15.5-2.4.noarch.rpm"
RPM_HASH = "a3d1564b2a0960facb08c09d7063a9a636b42f0a33f0eb260ed9386b5a68e13e0bee0caeb36a07b4431914e88ec2c3c259d3b4d33dff517d1b97c4d966aea013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(json-tricks) python311-json_tricks python3dist(json-tricks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

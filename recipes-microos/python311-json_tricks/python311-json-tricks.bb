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

PV = "3.16.1"

RPM_NAME = "python311-json_tricks-3.16.1-1.1.noarch.rpm"
RPM_HASH = "f5c5e5ad767f781bd6c9b68f02ac0362db8f07cf181895733884b2ac513de1aff3c2202055e645b0fc976ee8ca8e95c2a2f05567be85831f2f563a640196f6e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(json-tricks) python311-json_tricks python3dist(json-tricks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

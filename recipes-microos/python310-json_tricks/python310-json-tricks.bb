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

RPM_NAME = "python310-json_tricks-3.15.5-2.4.noarch.rpm"
RPM_HASH = "e1cc87dae9dcc0cca3b5292c1c6feee1349cf336ff660bede40c6c0d13664edb2966dad71d09384dfaf198afc807ec5b4daf638679fc2bfd815f38c38c26fb70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-json_tricks python3.10dist(json-tricks) python310-json_tricks python3dist(json-tricks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

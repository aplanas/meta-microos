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

RPM_NAME = "python39-json_tricks-3.16.1-1.1.noarch.rpm"
RPM_HASH = "4336cd9ca6a168f34ddbd98962efc9a8ac73e49ea185ccc3ba31b10fb87c3709092b90d37127897022210f8fcfce45857ff2959dc82e3e888746ef5f55196b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(json-tricks) \
python39-json_tricks \
python3dist(json-tricks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

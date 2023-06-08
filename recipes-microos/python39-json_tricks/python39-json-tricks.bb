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

RPM_NAME = "python39-json_tricks-3.15.5-2.4.noarch.rpm"
RPM_HASH = "314659eb08a21f623b137186098903c813dfc161d781fbb511eaca21e391ca1e6016ffed803f18dcad655e1721db8458669ab5d0c43e98e26407f555a847ef03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(json-tricks) python39-json_tricks python3dist(json-tricks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

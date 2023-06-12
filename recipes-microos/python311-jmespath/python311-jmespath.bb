SUMMARY = "Python module for declarative JSON document element extraction"
DESCRIPTION = "JMESPath (pronounced 'jaymz path') allows you to declaratively specify how \
to extract elements from a JSON document. \
 \
For example, given this document: \
 \
{'foo': {'bar': 'baz'}} \
 \
The jmespath expression foo.bar will return 'baz'. \
 \
JMESPath also supports: \
 \
Referencing elements in a list. Given the data: \
 \
{'foo': {'bar': ['one', 'two']}} \
 \
The expression: foo.bar[0] will return 'one'. You can also reference all \
the items in a list using the * syntax: \
 \
{'foo': {'bar': [{'name': 'one'}, {'name': 'two'}]}} \
 \
The expression: foo.bar[*].name will return ['one', 'two']. Negative \
indexing is also supported (-1 refers to the last element in the list). \
Given the data above, the expression foo.bar[-1].name will return ['two']. \
 \
The * can also be used for hash types: \
 \
{'foo': {'bar': {'name': 'one'}, 'baz': {'name': 'two'}}} \
 \
The expression: foo.*.name will return ['one', 'two']."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-jmespath-1.0.1-2.4.noarch.rpm"
RPM_HASH = "c2c6c97b250a146997dd71b9e8c3a23f8c3c89b15332412a4d2f45a0bcb41bd1a2efa6fb03988d8031de31f327d7b0ed937a93113af36bdca7763dddddbd5d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jmespath) \
python311-jmespath \
python3dist(jmespath)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-ply \
update-alternatives"

inherit rpm

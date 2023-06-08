SUMMARY = "A Python library to parse, create and handle HL7 v2x messages"
DESCRIPTION = "HL7apy is a Python package to handle HL7 <http://www.hl7.org> v2 \
messages according to HL7 specifications. \
 \
The main features include: \
 * Message parsing \
 * Message creation \
 * Message validation following the HL7 xsd specifications \
 * Access to elements by name, long name or position \
 * Support to all simple and complex datatypes \
 * Encoding chars customization \
 * Message encoding in ER7 format and compliant with MLLP protocol"
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python39-hl7apy-1.3.3-2.13.noarch.rpm"
RPM_HASH = "428c044b7b4fc5a6ed4b131ff371d4a59c55ff6951c03aa4d9eae083c5eb6e107951a8cc821951d026f57ab92dd3357896cd0722b8500441359bd3386b56d725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hl7apy) python39-hl7apy python3dist(hl7apy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm

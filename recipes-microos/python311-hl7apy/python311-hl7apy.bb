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

RPM_NAME = "python311-hl7apy-1.3.3-2.13.noarch.rpm"
RPM_HASH = "4a22461645602b1ebe072df0c71ce57644df9473f9fb2d41fe054b41ed77f89208dad36052c28f65b56d4e511625b6d9adba731aa526387d771f43172d475476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hl7apy) \
python311-hl7apy \
python3dist(hl7apy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm

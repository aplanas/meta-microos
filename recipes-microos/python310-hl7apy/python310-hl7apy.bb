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

RPM_NAME = "python310-hl7apy-1.3.3-2.13.noarch.rpm"
RPM_HASH = "b345c1f5ff043a55c130fa264df1a8957804164b0af2e7504478b6237c4c505d3764f1f16392587105ed50b901013cf5f922bc60e6487106caa3b972a4d50dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hl7apy \
python3.10dist(hl7apy) \
python310-hl7apy \
python3dist(hl7apy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm

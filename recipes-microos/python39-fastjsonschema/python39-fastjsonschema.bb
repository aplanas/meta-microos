SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.17.1"

RPM_NAME = "python39-fastjsonschema-2.17.1-1.1.noarch.rpm"
RPM_HASH = "9d1de7a784fd5da8b7463d74e4e1e906de95877f4aff86bd6efe47dfdfde9d4c4edc015aee3ff4f7c71e4c0c0212d39b847d8fe83d421ef2bff19176a736aa68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fastjsonschema) \
python39-fastjsonschema \
python3dist(fastjsonschema)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

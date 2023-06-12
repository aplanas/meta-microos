SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.72.10"

RPM_NAME = "python39-cfn-lint-0.72.10-1.5.noarch.rpm"
RPM_HASH = "9090b1de9563786486ed440428539acdcf65819657e468468446ea6822b0877cc4dce333fa111d816a63fa97bf0dc9cd7432707b1523d7d4b86d0bdd0d0d5a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfn-lint \
python3.9dist(cfn-lint) \
python39-cfn-lint \
python3dist(cfn-lint)"
RDEPENDS:${PN} += "(python39-jsonschema > 3.0 with python39-jsonschema < 5) \
/bin/sh \
/usr/bin/python3.9 \
git-core \
python(abi) \
python39-PyYAML \
python39-aws-sam-translator \
python39-jschema-to-python \
python39-jsonpatch \
python39-junit-xml \
python39-networkx \
python39-sarif-om \
update-alternatives"

inherit rpm

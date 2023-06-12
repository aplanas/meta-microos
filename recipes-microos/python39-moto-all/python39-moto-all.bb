SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install all extras (moto[all])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-moto-all-4.1.0-1.5.noarch.rpm"
RPM_HASH = "7232de2deada08c5f238fb59c4aa90bdb535493fed6f4cb4b513fb9bb78d2439c8097fa862c8fd69667803bd4189df9e8d2e5798a1b07a82ad28b8ad1a1b6b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-moto-all"
RDEPENDS:${PN} += "python39-PyYAML \
python39-aws-xray-sdk \
python39-cfn-lint \
python39-docker \
python39-graphql-core \
python39-idna \
python39-jsondiff \
python39-moto \
python39-openapi-spec-validator \
python39-pyparsing \
python39-python-jose \
python39-setuptools \
python39-sshpubkeys"

inherit rpm

SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "python311-google-cloud-translate-3.11.0-1.2.noarch.rpm"
RPM_HASH = "2ab53f46453202b1aeedef0a991eca86b61b619dfee28557a89a26623d29507338aa5e2acb49ffcc1459bfeb5b9430384af15802efeae961fa6b8ef598ed5a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-cloud-translate) \
python311-google-cloud-translate \
python3dist(google-cloud-translate)"
RDEPENDS:${PN} += "python(abi) \
python311-google-api-core \
python311-google-cloud-core \
python311-proto-plus \
python311-protobuf"

inherit rpm

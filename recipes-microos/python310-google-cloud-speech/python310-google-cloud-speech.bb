SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.19.0"

RPM_NAME = "python310-google-cloud-speech-2.19.0-1.2.noarch.rpm"
RPM_HASH = "2fbd3bdc97f4014f18f6c225d79e392c9148ee171dcbc7e1ba655d34303af97292e4220cca4e8f9b6d2023de2d9c4f1b3e971085e530fb8b4e55b3078ef96961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-speech \
python3.10dist(google-cloud-speech) \
python310-google-cloud-speech \
python3dist(google-cloud-speech)"
RDEPENDS:${PN} += "python(abi) \
python310-google-api-core \
python310-proto-plus \
python310-protobuf"

inherit rpm

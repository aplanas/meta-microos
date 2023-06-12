SUMMARY = "Google Cloud Speech API client library"
DESCRIPTION = "Cloud Speech API converts audio to text by applying neural network models."
LICENSE = "Apache-2.0"

PV = "2.19.0"

RPM_NAME = "python311-google-cloud-speech-2.19.0-1.2.noarch.rpm"
RPM_HASH = "a2e36c8e505e29367de13c8993ccf88531fd28ca7072f0a9a3055f1bd3bb32776f843eacca9c072dfc86126c8ed2b18cb6cb3dafe49abe3d42ea5cb8844a3035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-cloud-speech) \
python311-google-cloud-speech \
python3dist(google-cloud-speech)"
RDEPENDS:${PN} += "python(abi) \
python311-google-api-core \
python311-proto-plus \
python311-protobuf"

inherit rpm

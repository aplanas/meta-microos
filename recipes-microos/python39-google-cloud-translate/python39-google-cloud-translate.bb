SUMMARY = "Google Cloud Translation API client library"
DESCRIPTION = "With `Google Cloud Translation`_, you can dynamically translate text between \
thousands of language pairs. The Google Cloud Translation API lets websites \
and programs integrate with Google Cloud Translation programmatically."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "python39-google-cloud-translate-3.11.0-1.2.noarch.rpm"
RPM_HASH = "ffd182693f7c1af9450a0fa6fed4b79fab1ef9e289e15db19fa7162ae004e1735134b5fd2128b498bef97e3f2581d0ba9281f34a6ed916b7ac7b0bbe9d3da37d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-cloud-translate) python39-google-cloud-translate python3dist(google-cloud-translate)"
RDEPENDS:${PN} += "python(abi) python39-google-api-core python39-google-cloud-core python39-proto-plus python39-protobuf"

inherit rpm

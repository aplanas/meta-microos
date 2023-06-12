SUMMARY = "Generate mypy stub files from protobuf specs"
DESCRIPTION = "Generate mypy stub files from protobuf specs."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-mypy-protobuf-3.2.0-1.13.noarch.rpm"
RPM_HASH = "54b66ff79bd64dc241e44a76c9f2ff3100d309ef8d12f45899dd216f716238d774adf3b1b94b9a8dd5423e52b37e528e2305deebbe8bc05cf2f2ea0ad558b6c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mypy-protobuf) \
python39-mypy-protobuf \
python3dist(mypy-protobuf)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-protobuf \
update-alternatives"

inherit rpm

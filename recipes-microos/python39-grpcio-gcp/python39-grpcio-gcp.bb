SUMMARY = "Google Cloud Platform gRPC extensions"
DESCRIPTION = "gRPC extensions for Google Cloud Platform."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python39-grpcio-gcp-0.2.2-1.16.noarch.rpm"
RPM_HASH = "2cdb1cf059610ff4a6c9d580065dea55daedca47c8b4400a6db35a1c65d809617544318b4d3ae520f0574c7fdee27fa190d1525598c14e2a1f3e29f789032335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(grpcio-gcp) python39-grpcio-gcp python3dist(grpcio-gcp)"
RDEPENDS:${PN} += "python(abi) python39-grpcio"

inherit rpm

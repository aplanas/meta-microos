SUMMARY = "Google Cloud Platform gRPC extensions"
DESCRIPTION = "gRPC extensions for Google Cloud Platform."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python310-grpcio-gcp-0.2.2-1.16.noarch.rpm"
RPM_HASH = "cb3e671d9e8efa3d9e6047f84e2f8ca80bbcdcf18fd2a4daa5ba6723667adbc2fa46b4c2da5c735bca1dcba61980df3ee39e644e1b92198457dac4a834ee92bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grpcio-gcp \
python3.10dist(grpcio-gcp) \
python310-grpcio-gcp \
python3dist(grpcio-gcp)"
RDEPENDS:${PN} += "python(abi) \
python310-grpcio"

inherit rpm

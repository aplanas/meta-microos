SUMMARY = "Microsoft Azure Security Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Security namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.security namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-security-nspkg-1.0.0-1.10.noarch.rpm"
RPM_HASH = "0a15ce804b347e3d6bb3cd986d0e691b2eaaf8ac2afe4f4ea66a9503f6266a37fecfb3bf1c1da7455ff0f16fdbf0c38fd9348adfb00ec5ba06f14ab232bc0ed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-security-nspkg) \
python39-azure-security-nspkg \
python3dist(azure-security-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-nspkg"

inherit rpm

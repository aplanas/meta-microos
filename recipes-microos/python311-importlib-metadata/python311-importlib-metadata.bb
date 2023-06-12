SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "6.6.0"

RPM_NAME = "python311-importlib-metadata-6.6.0-1.1.noarch.rpm"
RPM_HASH = "c692fe1d04580300f882323699df20d2446a6b3c117e4583b7bde10d6f6cbe83d4469a21f639b8030f0f3cee0958313991ff3c47a5048109a358b7875a413e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(importlib-metadata) \
python311-importlib-metadata \
python311-importlib_metadata \
python3dist(importlib-metadata)"
RDEPENDS:${PN} += "python(abi) \
python311-zipp"

inherit rpm

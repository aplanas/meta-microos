SUMMARY = "Microsoft Communication Rooms Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Communication Services for Rooms."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python310-azure-communication-rooms-1.0.0~b3-1.1.noarch.rpm"
RPM_HASH = "495281dec35a0e0e2b1e816fe5ba1eec667e14508f4340e19a181f3aec2266a0d2e2d9866f0f3502c3893328a4b64bf7d7269d515b2ac222dad2785a07d634d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-rooms \
python3.10dist(azure-communication-rooms) \
python310-azure-communication-rooms \
python3dist(azure-communication-rooms)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-communication-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm

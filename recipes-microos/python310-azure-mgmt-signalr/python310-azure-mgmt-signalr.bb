SUMMARY = "Microsoft Azure SignalR Client Library"
DESCRIPTION = "This is the Microsoft Azure SignalR Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-mgmt-signalr-1.2.0-1.2.noarch.rpm"
RPM_HASH = "3d807584bd3218a10d2e657a1a1bbb177af5c969d21870cc4e8ec2a3748b6d5adfd8300de78479b0e54ec2fbfdb823bd46986e0b25f039fa861ed2599765f431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-signalr \
python3.10dist(azure-mgmt-signalr) \
python310-azure-mgmt-signalr \
python3dist(azure-mgmt-signalr)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm

SUMMARY = "Azure EventHubs Checkpoint Store client library for Python using Storage Blobs"
DESCRIPTION = "Azure EventHubs Checkpoint Store is used for storing checkpoints while processing events \
from Azure Event Hubs. This Checkpoint Store package works as a plug-in package to \
EventHubConsumerClient. It uses Azure Storage Blob as the persistent store for maintaining \
checkpoints and partition ownership information. \
 \
Please note that this is a sync library, for async version of the Azure EventHubs Checkpoint \
Store client library, please refer to the package azure-eventhub-checkpointstoreblob-aio."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-azure-eventhub-checkpointstoreblob-1.1.4-1.8.noarch.rpm"
RPM_HASH = "2a90140cb4cfa5ac905c653e89d08deb18754b19c55988b7d56e0167670d7f83a85b4e908b53efabdcc948e559fdcb1f35ad264c3e5016aa626c2eb360494b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventhub-checkpointstoreblob python3.10dist(azure-eventhub-checkpointstoreblob) python310-azure-eventhub-checkpointstoreblob python3dist(azure-eventhub-checkpointstoreblob)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-eventhub python310-azure-nspkg python310-cryptography python310-msrest"

inherit rpm

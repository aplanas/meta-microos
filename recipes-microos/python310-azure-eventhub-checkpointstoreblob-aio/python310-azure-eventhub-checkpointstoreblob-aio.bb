SUMMARY = "Azure EventHubs Checkpoint Store client library for Python using Storage Blobs"
DESCRIPTION = "Azure EventHubs Checkpoint Store is used for storing checkpoints while processing events \
from Azure Event Hubs. This Checkpoint Store package works as a plug-in package to \
EventHubConsumerClient. It uses Azure Storage Blob as the persistent store for maintaining \
checkpoints and partition ownership information. \
 \
Please note that this is an async library, for sync version of the Azure EventHubs Checkpoint \
Store client library, please refer to the package azure-eventhub-checkpointstoreblob."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-azure-eventhub-checkpointstoreblob-aio-1.1.4-1.8.noarch.rpm"
RPM_HASH = "1687540a77b2ee60303a23195d6a3dc3816277d55b823b96f1ce8252abee8b8dc336eb31e5ca3e0cf8e65d846746ba5455055f4902abb5a7c4c35098efbc1fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-eventhub-checkpointstoreblob-aio python3.10dist(azure-eventhub-checkpointstoreblob-aio) python310-azure-eventhub-checkpointstoreblob-aio python3dist(azure-eventhub-checkpointstoreblob-aio)"
RDEPENDS:${PN} += "python(abi) python310-aiohttp python310-azure-core python310-azure-eventhub python310-azure-nspkg python310-azure-storage-blob python310-cryptography python310-msrest"

inherit rpm

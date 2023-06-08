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

RPM_NAME = "python311-azure-eventhub-checkpointstoreblob-aio-1.1.4-1.8.noarch.rpm"
RPM_HASH = "0bb06521f280eeb62de5e2999ce63f44632f7bbf98073bc475a67f94c4600c51aed5d45e9ef8f14b39f57cf099a6a3aa2afcf066cd80b341287dc6547929bc4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-eventhub-checkpointstoreblob-aio) python311-azure-eventhub-checkpointstoreblob-aio python3dist(azure-eventhub-checkpointstoreblob-aio)"
RDEPENDS:${PN} += "python(abi) python311-aiohttp python311-azure-core python311-azure-eventhub python311-azure-nspkg python311-azure-storage-blob python311-cryptography python311-msrest"

inherit rpm

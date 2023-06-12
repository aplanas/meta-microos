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

RPM_NAME = "python311-azure-eventhub-checkpointstoreblob-1.1.4-1.8.noarch.rpm"
RPM_HASH = "b84cd9bdbc48f2ce440f1b3ec3db02e6716ae6e1fa5bcd8487fc4f732b17defdd7a053f7f78fc84a497d8fee138d72cc79cd79fbc2f32719497eee5593f4b5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-eventhub-checkpointstoreblob) \
python311-azure-eventhub-checkpointstoreblob \
python3dist(azure-eventhub-checkpointstoreblob)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-core \
python311-azure-eventhub \
python311-azure-nspkg \
python311-cryptography \
python311-msrest"

inherit rpm

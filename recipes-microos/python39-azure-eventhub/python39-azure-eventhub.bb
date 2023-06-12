SUMMARY = "Azure Event Hubs client library for Python"
DESCRIPTION = "Azure Event Hubs is a highly scalable publish-subscribe service that can ingest millions \
of events per second and stream them to multiple consumers. This lets you process and \
analyze the massive amounts of data produced by your connected devices and applications. \
Once Event Hubs has collected the data, you can retrieve, transform, and store it by using \
any real-time analytics provider or with batching/storage adapters. If you would like to \
know more about Azure Event Hubs, you may wish to review: \
[What is Event Hubs](https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-about)? \
 \
The Azure Event Hubs client library allows for publishing and consuming of Azure Event \
Hubs events and may be used to: \
 \
 - Emit telemetry about your application for business intelligence and diagnostic purposes. \
 - Publish facts about the state of your application which interested parties may observe \
   and use as a trigger for taking action. \
 - Observe interesting operations and interactions happening within your business or other \
   ecosystem, allowing loosely coupled systems to interact without the need to bind them together. \
 - Receive events from one or more publishers, transform them to better meet the needs of \
   your ecosystem, then publish the transformed events to a new stream for consumers to observe."
LICENSE = "MIT"

PV = "5.11.2"

RPM_NAME = "python39-azure-eventhub-5.11.2-1.2.noarch.rpm"
RPM_HASH = "cd9191aa81a8ad3d7523bd22de41d58cb33e1af4281f92d53295da1a0fdf6720009c1c6178ed963e9cac577c40359ea0beadc527debb6d335d0a9b4eec893f33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-eventhub) \
python39-azure-eventhub \
python3dist(azure-eventhub)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-core \
python39-azure-nspkg \
python39-typing_extensions"

inherit rpm

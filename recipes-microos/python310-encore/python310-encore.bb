SUMMARY = "Low-level core modules for building Python applications"
DESCRIPTION = "This package consists of a collection of core utility packages useful \
for building Python applications.  This package is intended to be at \
the bottom of the software stack and have zero required external \
dependencies aside from the Python Standard Library. \
 \
Packages: \
 \
  * Events: A package implementing a lightweight application-wide \
    Event dispatch system.  Listeners can subscribe to events based \
    on Event type or by filtering on event attributes.  Typical uses \
    include UI components listening to low-level progress \
    notifications and change notification for distributed resources. \
 \
  * Storage: Abstract base classes and concrete implementations of a \
    basic key-value storage API. The API is intended to be general \
    purpose enough to support a variety of local and remote storage \
    systems. \
 \
  * Concurrent: A package of tools for handling concurrency within \
    applications. \
 \
  * Terminal: Some utilities for working with text-based terminal \
    displays."
LICENSE = "Apache-2.0 & LGPL-2.1-only & Python-2.0"

PV = "0.8.0"

RPM_NAME = "python310-encore-0.8.0-1.5.noarch.rpm"
RPM_HASH = "12a25c0d0f44007c97deaa901d786bcb3fe455510465a3c192326cc41b2606b1aa6d734528f19a68f9682c07d00257b6b40eba3f9d25becc527ccbcc099b812a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-encore \
python3.10dist(encore) \
python310-encore \
python3dist(encore)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

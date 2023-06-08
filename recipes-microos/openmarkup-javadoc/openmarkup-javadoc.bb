SUMMARY = "Open Markup Interface for object realizers and XML object realization"
DESCRIPTION = "The Open Markup project defines an open API called Open Markup \
Interface for object realizers and XML object realization. \
 \
Object realization is a process by which software objects are created, \
configured, and processed according to machine-readable descriptions of \
those objects. It includes post-instantiation tasks, such as \
configuring objects with additional attributes or properties, \
connecting them with other objects to create complex object \
compositions, or otherwise manipulating them according to control \
information embedded in the object descriptions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "openmarkup-javadoc-1.1-24.6.noarch.rpm"
RPM_HASH = "e55e282f5173994ec3ae883ec5d8d150c7c2723166987ae804035f320106e672824c6e5636a7d20d6f9fb15a1558802606f0c46c84bd185de081bdabb1c88b69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmarkup-javadoc"
RDEPENDS:${PN} += ""

inherit rpm

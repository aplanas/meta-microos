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

RPM_NAME = "openmarkup-1.1-24.6.noarch.rpm"
RPM_HASH = "eb032896687bf306dfbffd86d523aec2cd041962067e146de9bc302f6dfb76389ee8f03362ea839cb7d066bf18e17ae272d7a496d2a1290d6dd1981966f1eb19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmarkup"
RDEPENDS:${PN} += ""

inherit rpm

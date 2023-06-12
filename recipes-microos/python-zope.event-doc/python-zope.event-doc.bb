SUMMARY = "Very basic event publishing system"
DESCRIPTION = "This package contains documentation files for python-zope.event."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python-zope.event-doc-4.6-4.1.noarch.rpm"
RPM_HASH = "9fe91715e67db97efa20146b840a2d55cdd2dce001b9c1a8ce11b1510f39baca287b663b0c217e631e040fa6d86a90202b800f88130398990cd7681267f7a671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.event-doc"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Javadoc for javaparser"
DESCRIPTION = "This package contains API documentation for javaparser."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.25.2"

RPM_NAME = "javaparser-javadoc-3.25.2-1.1.noarch.rpm"
RPM_HASH = "99a1365aee2e007180dec19a9717372a5df71b9ebfef3d79bea95dfbfc82ac364fdee9426eb912d7fc2ad4ffd9fa33947936ca82fc2be1328f242c3d33f03fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaparser-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadoc for javassist"
DESCRIPTION = "Javadoc for javassist. \
 \
Javadoc for javassist."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.29.2"

RPM_NAME = "javassist-javadoc-3.29.2-1.2.noarch.rpm"
RPM_HASH = "b925af9934cd1c899bbe60cb28a1489ae043b476fbffbb28cb0c3ef716f5ec4bc07d536dd98d020f81211c0e5644e467a06c57d83d4a742aaeef763ad5822e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Javadocs for jaxodraw"
DESCRIPTION = "This package contains the API documentation for jaxodraw."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "jaxodraw-javadoc-2.1.0-6.6.noarch.rpm"
RPM_HASH = "3614ae20294d6d4f25edccffd09cf8d8be3988d6698f50b9a22b82256efc3a9a6d3a59c8a9cd1904756aafd7b82f8cd453a7706a746599e0ff623c980ff4206f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxodraw-javadoc"
RDEPENDS:${PN} += "javapackages-tools \
jaxodraw"

inherit rpm

SUMMARY = "Tool to extract class/interface/method definitions from sources"
DESCRIPTION = "QDox is a parser for extracting class/interface/method definitions \
from source files complete with JavaDoc @tags. It is designed to be \
used by active code generators or documentation tools."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "qdox-2.0.1-2.6.noarch.rpm"
RPM_HASH = "ef7eb49d448947ba64edec6e1ff2f8ce2b4ab315702300c067b942ef6d49cfdd8338033a5922d92af8d8ca7e16b9cafdb0859316e621af6f5dd8f5eadfbb9c59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.thoughtworks.qdox:qdox) mvn(com.thoughtworks.qdox:qdox:pom:) mvn(qdox:qdox) mvn(qdox:qdox:pom:) osgi(com.thoughtworks.qdox) qdox"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm

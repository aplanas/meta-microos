SUMMARY = "Javadoc for xstream"
DESCRIPTION = "xstream API documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-javadoc-1.4.20-1.3.noarch.rpm"
RPM_HASH = "dac03250aa78f1265dd8d3fc7c40167de1f3b66e0f6beed69b026f3cdb829249c322b07e70fdbf2a5cb82fdff19864c73ecacf21d78b74f535cfa4e0805a6da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xstream-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

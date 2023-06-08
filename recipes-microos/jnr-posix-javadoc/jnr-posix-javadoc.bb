SUMMARY = "Javadoc for jnr-posix"
DESCRIPTION = "Javadoc for jnr-posix."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "3.1.16"

RPM_NAME = "jnr-posix-javadoc-3.1.16-1.1.noarch.rpm"
RPM_HASH = "567c4f2939ae7d3737c34ead28b1599cc2cfb268ea2a524bcf4d909abf51325c81e60493dfa066939b85e60db5cc17421baf4752f29af920216645b7701892af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-posix-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

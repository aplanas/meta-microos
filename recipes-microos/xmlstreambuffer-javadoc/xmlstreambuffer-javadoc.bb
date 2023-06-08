SUMMARY = "Javadoc for xmlstreambuffer"
DESCRIPTION = "This package contains javadoc for xmlstreambuffer."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.5.4"

RPM_NAME = "xmlstreambuffer-javadoc-1.5.4-3.4.noarch.rpm"
RPM_HASH = "e62be5a358010da758fc55d85e6745d6645d739977f5f5aae1caa11119d665a7b121f427a15dc4ccadd111b3b9233d96b7f8e10c77c5d3c28e4c3aa0fadfe800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlstreambuffer-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

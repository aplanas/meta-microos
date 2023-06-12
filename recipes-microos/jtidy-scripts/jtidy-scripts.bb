SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "BSD-3-Clause"

PV = "8.0"

RPM_NAME = "jtidy-scripts-8.0-30.6.noarch.rpm"
RPM_HASH = "fd84d4d7e8002011dbebdea40539883ca6ed11fd5c140d186a8ff355fe9703b93d78bb47c8e60cde600f0eef8de871f0d459880b91f28ff38e35b4ba566dbe19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jtidy-scripts"
RDEPENDS:${PN} += "/bin/bash \
javapackages-tools \
jtidy"

inherit rpm

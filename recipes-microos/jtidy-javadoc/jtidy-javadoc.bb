SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "BSD-3-Clause"

PV = "8.0"

RPM_NAME = "jtidy-javadoc-8.0-30.6.noarch.rpm"
RPM_HASH = "d67a350b4451aa9b371936da3bf0ce232a45f522d7383380e93085499c6b433ae1afb096fede5219028c1170e7171049480769f2453403429c492daa90a214d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jtidy-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

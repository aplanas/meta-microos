SUMMARY = "Java library for reading and editing user input in console applications"
DESCRIPTION = "JLine is a java library for reading and editing user input in console \
applications. It features tab-completion, command history, password \
masking, customizable keybindings, and pass-through handlers to use to \
chain to other console applications."
LICENSE = "BSD-3-Clause"

PV = "2.14.6"

RPM_NAME = "jline-2.14.6-5.4.noarch.rpm"
RPM_HASH = "53f7e94c5f64daa7fe58a0493be1b82ff848eafaef99f67b9fa80c6324cc928e20078a4cbcfb577ac6075ac31fe934f14624938bd3d8b0cde317ef33e817dc9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline \
mvn(jline:jline) \
mvn(jline:jline:pom:) \
osgi(jline)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.fusesource.jansi:jansi)"

inherit rpm

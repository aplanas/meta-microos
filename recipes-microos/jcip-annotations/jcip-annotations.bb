SUMMARY = "Java Concurrency in Practice"
DESCRIPTION = "Class, field, and method level annotations for describing thread-safety \
policies."
LICENSE = "CC-BY-2.5"

PV = "1.0"

RPM_NAME = "jcip-annotations-1.0-21.5.noarch.rpm"
RPM_HASH = "e83d928c0d0513c12d7a8e955c1451b36df440315e83c195c51a579841ac6d5339531ccf442851433789faf359888f6b301609cec1931050d9232033722a6aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcip-annotations mvn(net.jcip:jcip-annotations) mvn(net.jcip:jcip-annotations:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm

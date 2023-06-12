SUMMARY = "Class Model for Hk2"
DESCRIPTION = "Hundred Kilobytes Kernel Class Model."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-class-model-2.5.0-2.3.noarch.rpm"
RPM_HASH = "b561fa989a7bcbffd974e64e785de1253fde48ecb006937796dfc33ef86dd8c0929b3a11b0f56863aad441f62f0aaef6ea510eaf737b0b1fc1a3d931ad7f7b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-class-model \
mvn(org.glassfish.hk2:class-model) \
mvn(org.glassfish.hk2:class-model:pom:) \
osgi(org.glassfish.hk2.class-model)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.ow2.asm:asm-all)"

inherit rpm

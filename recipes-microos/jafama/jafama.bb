SUMMARY = "A (Strict) FastMath class with 1e-15ish accuracy"
DESCRIPTION = "Jafama (Java Fast Math) is a Java library aiming at providing faster versions \
of java.lang.Math treatments, at the eventual cost of 1e-15ish accuracy errors \
but still handling special cases properly (NaN, +-Infinity, ties, etc.). \
It also provides additional features, such as angles normalization methods, \
inverse hyperbolic trigonometry, etc."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "jafama-2.3.1-1.18.noarch.rpm"
RPM_HASH = "22b0a5d1720020a115b8a73883d1ff08cce690f23e9ad9b7d688ef5ba8d7abf814bd8664a3e0f7d64591fb11a978673a6363ea5db49db995a0bf5cc40b8fcb3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jafama mvn(net.jafama:jafama) mvn(net.jafama:jafama:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm

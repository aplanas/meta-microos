SUMMARY = "Type arithmetic library for Java5"
DESCRIPTION = "This library provides functions that perform type arithemtic over the \
type system of Java5. For example, one can compute that List<String> \
is a sub-type of Collection<String> but not Collection<Object>, you \
can compute the erasure of java.lang.reflect.Type, or you can \
determine the array component type T from A[T]."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.2"

RPM_NAME = "tiger-types-2.2-4.10.noarch.rpm"
RPM_HASH = "d353511954e281170eecac5bf4cffcc51b844abc0a3d2b67525d981ded32bfcb18b3e16d96bb8b4b46d8e4cdf04bef9445a1f8e5e152481bf5521c8f2849b79a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.jvnet:tiger-types) \
mvn(org.jvnet:tiger-types:pom:) \
osgi(org.jvnet.tiger-types) \
tiger-types"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

SUMMARY = "HK2 Run Level Service"
DESCRIPTION = "Hundred Kilobytes Kernel Run Level Service."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-runlevel-2.5.0-2.3.noarch.rpm"
RPM_HASH = "8307a40a5e50981e506020066a1bf12dde44e6e768a43af14e8c6eb3a763be573219ae37b85d825c628a61b5b8cc194c42df38b675dd064831b78a9cab2afe4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-runlevel mvn(org.glassfish.hk2:hk2-runlevel) mvn(org.glassfish.hk2:hk2-runlevel:pom:) osgi(org.glassfish.hk2.runlevel)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(javax.annotation:javax.annotation-api) mvn(org.glassfish.hk2:hk2-api) mvn(org.glassfish.hk2:hk2-locator)"

inherit rpm

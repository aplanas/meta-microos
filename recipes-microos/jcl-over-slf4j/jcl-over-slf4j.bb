SUMMARY = "JCL 1.1.1 implemented over SLF4J"
DESCRIPTION = "JCL 1.1.1 implemented over SLF4J."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "jcl-over-slf4j-1.7.36-3.3.noarch.rpm"
RPM_HASH = "f3489dcb7dddab84de37baffa8bc0eb34636569bcf45a6c517bae1dfb322b0e68758a92908686d89c2932f248a3b79fe85d9993987d04138c06e783bc39bc4af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcl-over-slf4j mvn(org.slf4j:jcl-over-slf4j) mvn(org.slf4j:jcl-over-slf4j:pom:) osgi(jcl.over.slf4j)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.slf4j:slf4j-api)"

inherit rpm

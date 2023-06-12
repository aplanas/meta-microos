SUMMARY = "Library of matchers for building test expressions"
DESCRIPTION = "Provides a library of matcher objects (also known as constraints or \
predicates) allowing 'match' rules to be defined declaratively, to be \
used in other frameworks. Typical scenarios include testing frameworks, \
mocking libraries and UI validation rules."
LICENSE = "BSD-3-Clause"

PV = "2.2"

RPM_NAME = "hamcrest-2.2-1.3.noarch.rpm"
RPM_HASH = "cde35df1b9e463de6ffd5c11d479cfb3073ce260188ba3f3c8ec8cd8012643b46becdc93c98916dd97850334b84e325f5e88f902c93eda271f7723a543076c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hamcrest \
hamcrest-core \
mvn(org.hamcrest:hamcrest) \
mvn(org.hamcrest:hamcrest-all) \
mvn(org.hamcrest:hamcrest-all:pom:) \
mvn(org.hamcrest:hamcrest-core) \
mvn(org.hamcrest:hamcrest-core:pom:) \
mvn(org.hamcrest:hamcrest-library) \
mvn(org.hamcrest:hamcrest-library:pom:) \
mvn(org.hamcrest:hamcrest:pom:) \
osgi(org.hamcrest)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

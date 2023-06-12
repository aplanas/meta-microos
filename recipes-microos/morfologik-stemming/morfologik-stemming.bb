SUMMARY = "Morfologik stemming library"
DESCRIPTION = "Morfologik provides high quality lemmatisation for the Polish language, \
along with tools for building and using byte-based finite state automata."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "morfologik-stemming-2.1.9-1.1.noarch.rpm"
RPM_HASH = "0f07e8ae5f16c511feef3fd67a5b1e04195f4e64bd74bb0c9b933ce7ad75c681dc28ad4b35d7ae0aa981f3632e41e118b90c5b80a872e9267c4077793c3cb729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "morfologik-stemming \
mvn(org.carrot2:morfologik-fsa) \
mvn(org.carrot2:morfologik-fsa-builders) \
mvn(org.carrot2:morfologik-fsa-builders:pom:) \
mvn(org.carrot2:morfologik-fsa:pom:) \
mvn(org.carrot2:morfologik-parent:pom:) \
mvn(org.carrot2:morfologik-polish) \
mvn(org.carrot2:morfologik-polish:pom:) \
mvn(org.carrot2:morfologik-speller) \
mvn(org.carrot2:morfologik-speller:pom:) \
mvn(org.carrot2:morfologik-stemming) \
mvn(org.carrot2:morfologik-stemming:pom:) \
mvn(org.carrot2:morfologik-tools) \
mvn(org.carrot2:morfologik-tools:pom:) \
osgi(org.carrot2.morfologik-fsa) \
osgi(org.carrot2.morfologik-fsa-builders) \
osgi(org.carrot2.morfologik-polish) \
osgi(org.carrot2.morfologik-speller) \
osgi(org.carrot2.morfologik-stemming)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.beust:jcommander) \
mvn(com.carrotsearch:hppc)"

inherit rpm

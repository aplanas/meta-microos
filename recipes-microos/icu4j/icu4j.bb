SUMMARY = "International Components for Unicode for Java"
DESCRIPTION = "The International Components for Unicode (ICU) library provides robust and \
full-featured Unicode services on a wide variety of platforms. ICU supports \
the most current version of the Unicode standard, and provides support for \
supplementary characters (needed for GB 18030 repertoire support). \
 \
Java provides a very strong foundation for global programs, and IBM and the \
ICU team played a key role in providing globalization technology into Sun's \
Java. But because of its long release schedule, Java cannot always keep \
up-to-date with evolving standards. The ICU team continues to extend Java's \
Unicode and internationalization support, focusing on improving \
performance, keeping current with the Unicode standard, and providing \
richer APIs, while remaining as compatible as possible with the original \
Java text and internationalization API design."
LICENSE = "BSD-3-Clause & MIT & Unicode & SUSE-Public-Domain"

PV = "73.1"

RPM_NAME = "icu4j-73.1-1.1.noarch.rpm"
RPM_HASH = "54cff71e7bdd58b83cf5972e59a1da4f4b48dccf05eb4dbbcac493e40b0ff0c4b9827cbd533472d1e121af3fda809eda3cf3b123675c63af2c8ab410c5a2aa39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icu4j mvn(com.ibm.icu:icu4j) mvn(com.ibm.icu:icu4j:pom:) osgi(com.ibm.icu)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm

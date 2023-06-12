SUMMARY = "Charset converter library of icu4j"
DESCRIPTION = "Charset converter library of icu4j."
LICENSE = "BSD-3-Clause & MIT & Unicode & SUSE-Public-Domain"

PV = "73.1"

RPM_NAME = "icu4j-charset-73.1-1.1.noarch.rpm"
RPM_HASH = "668b8f5cbf7d78c3ca1e969986b756869be9e66f4aeff56112eea66648c1263cac9a59d01f3d08ec43448dfff3ee2b9e13454ca22da6499f2adfe8d391645a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icu4j-charset \
mvn(com.ibm.icu:icu4j-charset) \
mvn(com.ibm.icu:icu4j-charset:pom:) \
osgi(com.ibm.icu.charset)"
RDEPENDS:${PN} += "icu4j \
java-headless \
javapackages-filesystem \
mvn(com.ibm.icu:icu4j)"

inherit rpm

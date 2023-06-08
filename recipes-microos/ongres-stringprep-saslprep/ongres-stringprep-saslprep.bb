SUMMARY = "SASLprep for ongres-stringprep"
DESCRIPTION = "SaslPrep is a profile of stringprep for user names and passwords (saslprep, RFC 4013)."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ongres-stringprep-saslprep-1.1-1.10.noarch.rpm"
RPM_HASH = "49e52b2974092c417d330df7f08612a2661a571535b86127018ed380cb088814dcbe63c858bfbd59d894cd06b47b9deb2c7d9cfb6d56b8a2d4d6af9b322edf0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.ongres.stringprep:saslprep) mvn(com.ongres.stringprep:saslprep:pom:) ongres-stringprep-saslprep"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.ongres.stringprep:stringprep)"

inherit rpm

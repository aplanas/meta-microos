SUMMARY = "Codegenerator"
DESCRIPTION = "This package contains a codegenerator for ongres-stringprep"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ongres-stringprep-codegenerator-1.1-1.10.noarch.rpm"
RPM_HASH = "1e9b538b77fb4f6dbdf879a60fddab148a6fdc3f07336997c78cc8e1d30eec1593d47311f9cb3f45d71932588fab710e44d2281a6e3b57e8d13234d8eae1ada6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.ongres.stringprep:codegenerator) mvn(com.ongres.stringprep:codegenerator:pom:) ongres-stringprep-codegenerator"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.apache.velocity:velocity)"

inherit rpm

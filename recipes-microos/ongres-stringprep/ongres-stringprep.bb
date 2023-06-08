SUMMARY = "Preparation of internationalized strings"
DESCRIPTION = "StringPrep is the preparation of internationalized strings (stringprep, RFC 3454)."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ongres-stringprep-1.1-1.10.noarch.rpm"
RPM_HASH = "adaf61903380673a8157fcd204e802963cc0b860fc6c251a0f6502b18a0a22808f13d3e580f408709428ccd75aa07becaa3e86acc8fdc7d0f92f4cb8bf419882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.ongres.stringprep:stringprep) mvn(com.ongres.stringprep:stringprep:pom:) ongres-stringprep"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm

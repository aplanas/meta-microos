SUMMARY = "Java Unit of Measurement Libraries (JSR 363)"
DESCRIPTION = "Units of Measurement Libraries - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-1.2-1.18.noarch.rpm"
RPM_HASH = "654bb095924134e929244ac2c933fcf24488aba0b8c1e2a78d4cc94b3f4423cba1e8ab69064cc08703c92d2d29d20243d4ebf42f5f1caabefd88787d62810774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(tech.uom.lib:uom-lib:pom:) uom-lib"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(tech.uom:uom-parent:pom:)"

inherit rpm

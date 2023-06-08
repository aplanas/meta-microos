SUMMARY = "A collection of Swing components"
DESCRIPTION = "SwingX contains a collection of powerful, useful, and just plain fun Swing \
components. Each of the Swing components have been extended, providing \
data-aware functionality out of the box. New useful components have been \
created like the JXDatePicker, JXTaskPane, and JXImagePanel."
LICENSE = "LGPL-2.0-only"

PV = "1.6.5.1"

RPM_NAME = "swingx-1.6.5.1-1.10.noarch.rpm"
RPM_HASH = "2fc5faff75a3cd5dde76f003aab9fbca9e6e61a718e2356319f4d528695211a84117bb8c2a9f2473eb2518a20c07d98d24005fab77e88fc16e60748a553db496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.swinglabs.swingx:swingx-action) mvn(org.swinglabs.swingx:swingx-action:pom:) mvn(org.swinglabs.swingx:swingx-all) mvn(org.swinglabs.swingx:swingx-all:pom:) mvn(org.swinglabs.swingx:swingx-autocomplete) mvn(org.swinglabs.swingx:swingx-autocomplete:pom:) mvn(org.swinglabs.swingx:swingx-beaninfo) mvn(org.swinglabs.swingx:swingx-beaninfo:pom:) mvn(org.swinglabs.swingx:swingx-common) mvn(org.swinglabs.swingx:swingx-common:pom:) mvn(org.swinglabs.swingx:swingx-core) mvn(org.swinglabs.swingx:swingx-core:pom:) mvn(org.swinglabs.swingx:swingx-graphics) mvn(org.swinglabs.swingx:swingx-graphics:pom:) mvn(org.swinglabs.swingx:swingx-mavensupport) mvn(org.swinglabs.swingx:swingx-mavensupport:pom:) mvn(org.swinglabs.swingx:swingx-painters) mvn(org.swinglabs.swingx:swingx-painters:pom:) mvn(org.swinglabs.swingx:swingx-plaf) mvn(org.swinglabs.swingx:swingx-plaf:pom:) mvn(org.swinglabs.swingx:swingx-project:pom:) swingx"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm

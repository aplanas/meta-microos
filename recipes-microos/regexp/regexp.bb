SUMMARY = "Simple regular expressions API"
DESCRIPTION = "Regexp is a 100% Pure Java Regular Expression package that was \
graciously donated to the Apache Software Foundation by Jonathan Locke. \
He originally wrote this software back in 1996 and it has stood up \
quite well to the test of time. It includes complete Javadoc \
documentation as well as a simple Applet for visual debugging and \
testing suite for compatibility."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "regexp-1.5-23.6.noarch.rpm"
RPM_HASH = "1071078d9289e3630bc04f6a3c95841aa0d98859f9c8d7578446bdf22608f4d61076c5201f5b6f67c172fbdba62e7754149e48e335b47324f71d1f39b8ada7c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(jakarta-regexp:jakarta-regexp) mvn(jakarta-regexp:jakarta-regexp:pom:) mvn(regexp:regexp) mvn(regexp:regexp:pom:) regexp"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm

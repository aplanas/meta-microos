SUMMARY = "Java API for handling Windows ini file format"
DESCRIPTION = "The [ini4j] is a simple Java API for handling configuration files in \
Windows .ini format. Additionally, the library includes Java \
Preferences API implementation based on the .ini file."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "ini4j-0.5.1-28.9.noarch.rpm"
RPM_HASH = "a8a11d2c193ef9f194e9ffe3c95433d13acbfd98bce219615a2b034a1d123d0c60dc5a64d5db69a755ed7eb312b6cbef25c8226038eae88eb81e2570d89a29ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ini4j mvn(org.ini4j:ini4j) mvn(org.ini4j:ini4j:pom:)"
RDEPENDS:${PN} += "java java-headless javapackages-filesystem"

inherit rpm

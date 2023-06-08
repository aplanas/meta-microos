SUMMARY = "OpenRegex regular expressions library"
DESCRIPTION = "OpenRegex is an efficient and flexible library for running regular expressions \
over sequences of user-defined objects."
LICENSE = "LGPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "openregex-1.1.1-3.13.noarch.rpm"
RPM_HASH = "bd89ee70200691eff6629fa26fe918290fe36d1f87ec075e0a6548043637ddcc82f66af9080f356f7ad707841702d6f8004222f5b78553ac8c3cb608ad5080a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(edu.washington.cs.knowitall:openregex) mvn(edu.washington.cs.knowitall:openregex:pom:) openregex"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.google.code.findbugs:jsr305) mvn(com.google.guava:guava)"

inherit rpm

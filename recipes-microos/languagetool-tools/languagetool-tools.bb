SUMMARY = "Style and Grammar Checker for 25+ Languages - Tools package"
DESCRIPTION = "LanguageTool is a free and open-source grammar checker. \
This package contains the tools for dictionary developers"
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-tools-4.8-3.1.noarch.rpm"
RPM_HASH = "6dede961786266eaa3f53be85afacdd999e68b636404c2e944899591da88aad02d7df4080975e9a9b171430bb2401923bac332a5ae38f1007b6d4a758371c473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-tools \
mvn(org.languagetool:languagetool-tools) \
mvn(org.languagetool:languagetool-tools:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-cli:commons-cli) \
mvn(org.carrot2:morfologik-tools) \
mvn(org.languagetool:languagetool-core)"

inherit rpm

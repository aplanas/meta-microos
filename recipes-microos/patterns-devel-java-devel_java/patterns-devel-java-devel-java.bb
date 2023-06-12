SUMMARY = "Java Development"
DESCRIPTION = "Tools and libraries for software development using the Java programming language."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-java-devel_java-20170319-5.12.aarch64.rpm"
RPM_HASH = "e6bc574573baf322944c0925d97358d8203ea6d24957d60a750d490eb57b8a9875635df0712cafae5a8675689b962b1a481b336f2881f873957aa1badea2fedf"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-devel-java-devel_java \
patterns-devel-java-devel_java(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

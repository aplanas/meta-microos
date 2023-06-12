SUMMARY = "JFreeReport General Serialization Framework"
DESCRIPTION = "Libserializer contains a general serialization framework that simplifies the \
task of writing custom java serialization handlers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.6"

RPM_NAME = "libserializer-1.1.6-1.4.noarch.rpm"
RPM_HASH = "22b15ea01b02d297b8c98b41c103dde27dc53c66df0b3141488fc7921dad94b9d95d722dd66f4bb6490a357e2a24d9edba53909213f7c221b0ef644e80692444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libserializer"
RDEPENDS:${PN} += "java \
jpackage-utils \
libbase"

inherit rpm

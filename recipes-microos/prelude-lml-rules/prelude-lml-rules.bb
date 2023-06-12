SUMMARY = "Prelude LML community ruleset"
DESCRIPTION = "Rules for Prelude LML contributed by the community."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-lml-rules-5.2.0-1.8.noarch.rpm"
RPM_HASH = "973bfe280f753b2788f94687d2904f08c36d935bea2ba44f481481f5e65a9227eaff797b1108906bb995e3125a7d283bddb4ddc9c20da05ab2855783fa2304ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(prelude-lml-rules) \
prelude-lml-rules"
RDEPENDS:${PN} += "/usr/bin/perl \
prelude-lml"

inherit rpm

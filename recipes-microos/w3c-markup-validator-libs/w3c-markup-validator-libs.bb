SUMMARY = "SGML and XML DTDs for the W3C Markup Validator"
DESCRIPTION = "SGML and XML DTDs for the W3C Markup Validator."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "w3c-markup-validator-libs-1.3-10.15.noarch.rpm"
RPM_HASH = "f481ac6870c35552d37c857733cf7c06327ca277a8ec4a0e0f8313be1fc4f1a9bbee15b245f67161687927e4357aa17cd4cbffe7b9ec9a209eaf260421bb78bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(w3c-markup-validator-libs) w3c-markup-validator-libs"
RDEPENDS:${PN} += "/bin/sh sgml-skel"

inherit rpm

SUMMARY = "Plugin for writing RESTful apps with Dancer2"
DESCRIPTION = "This plugin helps you write a RESTful webservice with Dancer2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-Dancer2-Plugin-REST-1.02-1.11.noarch.rpm"
RPM_HASH = "ea778bc6eb2b9f8071aaa438d0bfa7375c06a478a0159671ac8d8913f01966c776d7e287533fe0cdbad495760286b3d046cedc28f345d667c0bb2d1708512175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Dancer2::Plugin::REST) perl-Dancer2-Plugin-REST"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Dancer2) perl(Dancer2::Core::HTTP) perl(Dancer2::Plugin) perl(Dancer2::Serializer::Mutable) perl(Moo)"

inherit rpm

SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.7"

RPM_NAME = "python39-ldas-tools-al-swig-2.6.7-3.7.aarch64.rpm"
RPM_HASH = "2e7d2173b232f12ea472428a6e4e3e3b7f4519fb268e2ce34f49d9c6359eee2474b1bfadd227bc43e25914d262a621a8e07c13288a7ff105b5115c898f7d7e7b"

RPROVIDES:${PN} += "python39-ldas-tools-al-swig python39-ldas-tools-al-swig(aarch-64)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

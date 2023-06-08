SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.7"

RPM_NAME = "python310-ldas-tools-al-swig-2.6.7-3.7.aarch64.rpm"
RPM_HASH = "0ac65e57bbca8d226e9f082e0ccd5e05b757351821308e5b3e942e43530c0bd8b8c9dc8e0a5f613160a0fa3a6c49e7dcf46215a491f61cca8dd461621b96a1b1"

RPROVIDES:${PN} += "python3-ldas-tools-al-swig python310-ldas-tools-al-swig python310-ldas-tools-al-swig(aarch-64)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

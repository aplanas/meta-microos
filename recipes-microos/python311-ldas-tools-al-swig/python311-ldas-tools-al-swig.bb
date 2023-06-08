SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.7"

RPM_NAME = "python311-ldas-tools-al-swig-2.6.7-3.7.aarch64.rpm"
RPM_HASH = "19c21829161ecfe675cb98a412212bd7b2225ea13a6a9066e98a026764f2696b92e15cfcaa442288e92f7eeac1515ac969cf8bcd0473f4eb2f211f52aec8d172"

RPROVIDES:${PN} += "python311-ldas-tools-al-swig python311-ldas-tools-al-swig(aarch-64)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

SUMMARY = "Extensible application framework for Python"
DESCRIPTION = "Envisage is a Python-based framework for building extensible \
applications, that is, applications whose functionality can be \
extended by adding 'plug-ins'. Envisage provides a standard mechanism \
for features to be added to an application. When building an \
application using Envisage, the entire application consists primarily \
of plug-ins. In this respect, it is similar to the Eclipse and \
Netbeans frameworks for Java applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & Python-2.0 & LGPL-3.0-only & CC-BY-SA-1.0 & CC-BY-SA-2.0 & CC-BY-SA-2.5 & CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "6.1.1"

RPM_NAME = "python39-envisage-6.1.1-1.3.noarch.rpm"
RPM_HASH = "44df0dbc9dac727da44eaef3f6abe02fad7a88eb3b162fe58f5840d10d40d2f626d3bee47220127149495574c58ee9eb28859d9a783376541669c7f26b5fd2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(envisage) \
python39-envisage \
python3dist(envisage)"
RDEPENDS:${PN} += "python(abi) \
python39-traits"

inherit rpm

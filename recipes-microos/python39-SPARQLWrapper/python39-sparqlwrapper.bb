SUMMARY = "SPARQL Endpoint interface to Python"
DESCRIPTION = "This is a wrapper around a SPARQL service. It helps in creating the \
query URI and, possibly, convert the result into a more manageable \
format."
LICENSE = "W3C"

PV = "1.8.5"

RPM_NAME = "python39-SPARQLWrapper-1.8.5-2.6.noarch.rpm"
RPM_HASH = "f8c5a4d4f7b670d503293e93701606e15e5760e3095dfc98cfd5638bb4b4ee0323dba11d087665b11ca5c27485b0a589f448800dc6118b69061bdd1f1b0ea60c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sparqlwrapper) python39-SPARQLWrapper python3dist(sparqlwrapper)"
RDEPENDS:${PN} += "python(abi) python39-rdflib"

inherit rpm

SUMMARY = "Python module to build tested documentation"
DESCRIPTION = "Manuel lets the user build tested documentation. \
 \
Documentation, a full list of included plug-ins, and examples are available \
with the -doc package and at http://packages.python.org/manuel/."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python39-manuel-1.12.4-4.1.noarch.rpm"
RPM_HASH = "b2fc112614b5409636118f916dfe883d72c3ea037bca4ae3225d1220589c897dbcdaaf4c48bbb7a1c342ad2bf6f9edc3e4df21554d8c72e94b8738c0d023ec8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(manuel) python39-manuel python3dist(manuel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

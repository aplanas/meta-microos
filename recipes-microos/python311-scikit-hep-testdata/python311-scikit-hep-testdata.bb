SUMMARY = "Example HEP files for testing and demonstrating"
DESCRIPTION = "A common package to provide example files (*e.g*. ROOT) for testing and \
developing packages against.  The sample of files is representative of typical \
files found 'in the wild'. \
 \
In addition to including some root files directly, this package adds some \
simple helper methods to get larger files from common open-access data \
repositories."
LICENSE = "BSD-3-Clause"

PV = "0.4.30"

RPM_NAME = "python311-scikit-hep-testdata-0.4.30-1.1.noarch.rpm"
RPM_HASH = "cb8d16d030785fedc886f6260ddaa266bfc6b55f924e51db281e87da4bb64a67fe97bac5ce98402faac197e38fa1751b6f6230dd62c6613f082d157cd32b3251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(scikit-hep-testdata) \
python311-scikit-hep-testdata \
python3dist(scikit-hep-testdata)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyYAML \
python311-requests \
scikit-hep-testdata-files \
update-alternatives"

inherit rpm

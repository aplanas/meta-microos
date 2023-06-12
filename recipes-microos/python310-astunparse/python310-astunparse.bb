SUMMARY = "An AST unparser for Python"
DESCRIPTION = "This is a factored out version of ``unparse`` found in the Python \
source distribution; under Demo/parser in Python 2 and under \
Tools/parser in Python 3. \
 \
This library is single-source compatible with Python 2.6 through \
Python 3.5. It is authored by the Python core developers; I have \
simply merged the Python 2.7 and the Python 3.5 source and test \
suites, and added a wrapper. This factoring out is to provide a \
library implementation that supports both versions. \
 \
Added to this is a pretty-printing dump utility function."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.6.3"

RPM_NAME = "python310-astunparse-1.6.3-5.1.aarch64.rpm"
RPM_HASH = "f2a7b633a0fd260ae485c06d4a8a0363911a1cac5f6ea10a0b6d030edd913b054b94a84b7e8ceee3b40c368e9c27b86c60c151ecc88ce22c7797881bb5ef28ff"

RPROVIDES:${PN} += "python3-astunparse \
python3.10dist(astunparse) \
python310-astunparse \
python310-astunparse(aarch-64) \
python3dist(astunparse)"
RDEPENDS:${PN} += "python(abi) \
python310-six \
python310-wheel"

inherit rpm

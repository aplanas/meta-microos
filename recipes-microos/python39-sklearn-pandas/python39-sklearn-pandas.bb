SUMMARY = "Pandas integration with sklearn"
DESCRIPTION = "This module provides a bridge between Scikit-Learn's machine learning \
methods and pandas-style Data Frames."
LICENSE = "BSD-2-Clause & Zlib"

PV = "2.2.0"

RPM_NAME = "python39-sklearn-pandas-2.2.0-2.3.noarch.rpm"
RPM_HASH = "8898929ceb134648e71bb528f1c9931c5f88db997bdcd61cc8ed807ca3fff7defe91d9aeb74e48cea28f1864a644f9921cb299622bf876a38a2b367a0c0a3fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sklearn-pandas) python39-sklearn-pandas python3dist(sklearn-pandas)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-pandas python39-scikit-learn python39-scipy"

inherit rpm

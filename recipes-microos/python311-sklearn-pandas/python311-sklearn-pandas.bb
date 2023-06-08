SUMMARY = "Pandas integration with sklearn"
DESCRIPTION = "This module provides a bridge between Scikit-Learn's machine learning \
methods and pandas-style Data Frames."
LICENSE = "BSD-2-Clause & Zlib"

PV = "2.2.0"

RPM_NAME = "python311-sklearn-pandas-2.2.0-2.3.noarch.rpm"
RPM_HASH = "505c38c52e63c0f39aa08b51190b745287324951f183a908eb8b39fa01400ce9c1eacb7ff371b0214be2f358125bc31da419fdf50b13ba20c11d8dda43bf627e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sklearn-pandas) python311-sklearn-pandas python3dist(sklearn-pandas)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-pandas python311-scikit-learn python311-scipy"

inherit rpm

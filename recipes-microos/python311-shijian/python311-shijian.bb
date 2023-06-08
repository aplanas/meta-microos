SUMMARY = "Python utility functions relating to time and filenames"
DESCRIPTION = "A Python module with a number of utility functions for formatting \
timestamps, counting time, and deriving non-overlapping filenames or \
sequences."
LICENSE = "GPL-3.0-only"

PV = "2020.1.29.1857"

RPM_NAME = "python311-shijian-2020.1.29.1857-2.9.noarch.rpm"
RPM_HASH = "556e7d7dc0f9db3aa2f48fef04a6eea80816ca0060981ee36126556eaae7f5a2ae5d617622203505f1ff07d40e102bbace5fe9dbfc0d7ab8e73f5b449a9e280b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(shijian) python311-shijian python3dist(shijian)"
RDEPENDS:${PN} += "python311-matplotlib python311-numpy python311-pandas python311-python-dateutil python311-scikit-learn python311-scipy python311-seaborn python311-technicolor"

inherit rpm

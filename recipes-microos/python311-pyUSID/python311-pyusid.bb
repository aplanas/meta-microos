SUMMARY = "Framework for processing scientific data (USID)"
DESCRIPTION = "Framework for storing, visualizing, and processing Universal Spectroscopic \
and Imaging Data (USID)."
LICENSE = "MIT"

PV = "0.0.10.post2"

RPM_NAME = "python311-pyUSID-0.0.10.post2-1.2.noarch.rpm"
RPM_HASH = "9886a532cc5b49c0807ec61ff9c80a1e36b99ea440b526a86d274389c5f146d7a5d34290ad2f742571832540687451aa7e98c03ac49f93479bb316931103ec96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyusid) python311-pyUSID python3dist(pyusid)"
RDEPENDS:${PN} += "python(abi) python311-Pillow python311-cytoolz python311-dask python311-h5py python311-numpy python311-psutil python311-sidpy python311-toolz"

inherit rpm

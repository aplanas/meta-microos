SUMMARY = "Utilities for processing Spectroscopic and Imaging Data"
DESCRIPTION = "Python utilities for storing, visualizing, and processing Spectroscopic and Imaging Data (SID)."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "python311-sidpy-0.11.2-2.2.noarch.rpm"
RPM_HASH = "db543c887bda5b816036b74eee6cb15fd96a2e973a941b7dff41cf5eee9a2ef8235a95d3e97bdaebc334e3a59cec4ea2ac4e0e6b1e94a89589981bb4b1b1cb00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sidpy) \
python311-sidpy \
python3dist(sidpy)"
RDEPENDS:${PN} += "python(abi) \
python311-ase \
python311-cytoolz \
python311-dask \
python311-dask-array \
python311-distributed \
python311-h5py \
python311-ipython \
python311-ipywidgets \
python311-joblib \
python311-matplotlib \
python311-numpy \
python311-psutil \
python311-scikit-learn \
python311-scipy \
python311-toolz"

inherit rpm

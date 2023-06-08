SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python310-audiomate-6.0.0-3.1.noarch.rpm"
RPM_HASH = "36f7300f3dc1daf9211f7e03e2a1dc7b2f4bdfcb803e9da7d72bd7bb99c0b0f137f1467ff466a67effe75d1fdf138a649f4a14d7abb78b757027605379e5edbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audiomate python3.10dist(audiomate) python310-audiomate python3dist(audiomate)"
RDEPENDS:${PN} += "python(abi) python310-PGet python310-audioread python310-h5py python310-intervaltree python310-librosa python310-networkx python310-numba python310-numpy python310-requests python310-scipy python310-sox"

inherit rpm

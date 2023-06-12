SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python39-audiomate-6.0.0-4.1.noarch.rpm"
RPM_HASH = "5332bda362ca8c3b171c1abc59af9c3c3c1f83630c37969d5596fb97a049175e648eef5d6fc8c80b9e1bb0235b73727e7a4b5782f63545c91b388b9cd6a42560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(audiomate) python39-audiomate python3dist(audiomate)"
RDEPENDS:${PN} += "python(abi) python39-PGet python39-audioread python39-h5py python39-intervaltree python39-librosa python39-networkx python39-numba python39-numpy python39-requests python39-scipy python39-sox"

inherit rpm

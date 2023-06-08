SUMMARY = "A library for working with audio datasets"
DESCRIPTION = "Audiomate is a library providing datastructures for accessing/loading \
audio datasets."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python39-audiomate-6.0.0-3.1.noarch.rpm"
RPM_HASH = "bb0af8e63a53d13f38e758246a0e708307330eaaa147a184952cd0737f4a91809990829b42b6ee394229e4088307dcb92ba7b0cdc72665c066715996b29e3fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(audiomate) python39-audiomate python3dist(audiomate)"
RDEPENDS:${PN} += "python(abi) python39-PGet python39-audioread python39-h5py python39-intervaltree python39-librosa python39-networkx python39-numba python39-numpy python39-requests python39-scipy python39-sox"

inherit rpm

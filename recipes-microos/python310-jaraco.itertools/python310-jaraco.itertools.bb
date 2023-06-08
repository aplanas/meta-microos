SUMMARY = "Tools to work with iterables"
DESCRIPTION = "jaraco.itertools Tools for working with iterables. \
Complements itertools and more_itertools."
LICENSE = "MIT"

PV = "6.2.1"

RPM_NAME = "python310-jaraco.itertools-6.2.1-2.1.noarch.rpm"
RPM_HASH = "e821c0ab156edf46b211990fc28bdc34e148b001ea514af7bee569c6de4a1f6c22ac53b2a575fc4f14364d46c09e47488610b397f957c57b8caa496edd927c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.itertools python3.10dist(jaraco.itertools) python310-jaraco.itertools python3dist(jaraco.itertools)"
RDEPENDS:${PN} += "python(abi) python310-inflect python310-more-itertools"

inherit rpm

SUMMARY = "Itertools and builtins for AsyncIO and mixed iterables"
DESCRIPTION = "Implementation of itertools, builtins, and more for AsyncIO and mixed-type iterables."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-aioitertools-0.11.0-1.3.noarch.rpm"
RPM_HASH = "10c9a33c425bdb52ee6fc73ce761d20827784f87fde4a3dfa1b70ad4f7642567f5724ac0cfe7d33eb623c2babe993730b0b1c3507fdd827371e8da8f4a25e4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioitertools \
python3.10dist(aioitertools) \
python310-aioitertools \
python3dist(aioitertools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

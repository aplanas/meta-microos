SUMMARY = "An object oriented approach to visualization of 1D to 4D data"
DESCRIPTION = "Visvis is a Python library for visualization of 1D to 4D data in an \
object oriented way. Essentially, visvis is an object oriented layer \
of Python on top of OpenGl. A Matlab/Matplotlib-like interface in the \
form of a set of functions allows creation of objects (e.g. plot(), \
imshow(), volshow(), surf())."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "python39-visvis-1.13.0-1.13.noarch.rpm"
RPM_HASH = "5a06be1c58cb6946219856ddb64ad40b3da7c31f2eede507cbd1a236bc232628fc418ebd018b89419a5a11b43aac25e8de51c0ac4be1f07f92173fd0906849e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(visvis) \
python39-visvis \
python3dist(visvis)"
RDEPENDS:${PN} += "python(abi) \
python39-numpy \
python39-opengl \
python39-qt5"

inherit rpm

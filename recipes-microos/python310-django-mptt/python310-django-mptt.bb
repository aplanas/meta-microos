SUMMARY = "Modified Preorder Tree Traversal for Django Models"
DESCRIPTION = "Utilities for implementing Modified Preorder Tree Traversal with your Django Models and working with trees of Model instances."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "python310-django-mptt-0.14-1.4.noarch.rpm"
RPM_HASH = "7ee67016e9e22af657eda3ef4600e451d61b94b1924ea72ac95c7aa624a22ced7424fbf719a008fe806ea8e631e08c6d7595407584cbda3dd1c5f3cbec949b22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mptt \
python3.10dist(django-mptt) \
python310-django-mptt \
python3dist(django-mptt)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-django-js-asset"

inherit rpm

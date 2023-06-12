SUMMARY = "Manage dynamic plugins for Python applications"
DESCRIPTION = "Python makes loading code dynamically easy, allowing you to configure \
and extend your application by discovering and loading extensions \
(plugins) at runtime. Many applications implement their own \
library for doing this, using ``__import__`` or ``importlib``. \
stevedore avoids creating yet another extension \
mechanism by building on top of setuptools entry points. The code \
for managing entry points tends to be repetitive, though, so stevedore \
provides manager classes for implementing common patterns for using \
dynamically loaded extensions. \
 \
This package contains the Python 3.x module"
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python3-stevedore-5.0.0-1.1.noarch.rpm"
RPM_HASH = "10ac01668db5e84effbafb945d43ecde668cb27d52ef940cdc609c74a4096e8b21c5cfc38910715ee948223a8c25117937237c627b075950a0dbca1a08b385ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stevedore \
python3.10dist(stevedore) \
python3dist(stevedore)"
RDEPENDS:${PN} += "python(abi) \
python3-importlib-metadata \
python3-pbr"

inherit rpm

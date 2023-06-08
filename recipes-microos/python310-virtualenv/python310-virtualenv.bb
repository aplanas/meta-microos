SUMMARY = "Virtual Python Environment builder"
DESCRIPTION = "virtualenv is a tool to create isolated Python environments. \
The basic problem being addressed is one of dependencies and versions, and \
indirectly permissions. Imagine you have an application that needs version 1 \
of LibFoo, but another application requires version 2. \
 \
Or more generally, what if you want to install an application and leave it be? \
If an application works, any change in its libraries or the versions of those \
libraries can break the application. \
 \
Also, what if you cant install packages into the global site-packages \
directory? For instance, on a shared host. \
 \
In all these cases, virtualenv can help you. It creates an environment that \
has its own installation directories, that doesnt share libraries with other \
virtualenv environments (and optionally doesnt use the globally installed \
libraries either)."
LICENSE = "MIT"

PV = "20.22.0"

RPM_NAME = "python310-virtualenv-20.22.0-1.1.noarch.rpm"
RPM_HASH = "d401f2577f85087b2281ebdd7e53e81168bfde409ac41604ad80a25bfcee3ebbbd00353b29d04eb712c417c3d919f5f8eb7b1b71d095da320ab20dba6f12f32f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtualenv python3.10dist(virtualenv) python310-virtualenv python3dist(virtualenv)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-backports.entry_points_selectable python310-distlib python310-filelock python310-platformdirs python310-setuptools update-alternatives"

inherit rpm

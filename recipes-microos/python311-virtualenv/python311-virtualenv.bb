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

RPM_NAME = "python311-virtualenv-20.22.0-1.1.noarch.rpm"
RPM_HASH = "d9e58761f40447e9c1fa5ffa23a84beb7be711d4ce3507a870d775a633bbad1cbeddd1154d76142370714c68cba5d222766c6d12ab6d8cb3e9a17da61402e484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(virtualenv) python311-virtualenv python3dist(virtualenv)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-backports.entry_points_selectable python311-distlib python311-filelock python311-platformdirs python311-setuptools update-alternatives"

inherit rpm

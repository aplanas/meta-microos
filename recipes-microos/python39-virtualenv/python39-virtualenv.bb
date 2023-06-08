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

RPM_NAME = "python39-virtualenv-20.22.0-1.1.noarch.rpm"
RPM_HASH = "a1ad8a102179536b7efc492f21d15270e120f5e41d4864eb77e2b6ad41cf5c3abe687c6ef30b41aa54cf4a46bb37af52a331adc87688d7af24f37c343a334ae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(virtualenv) python39-virtualenv python3dist(virtualenv)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-backports.entry_points_selectable python39-distlib python39-filelock python39-platformdirs python39-setuptools update-alternatives"

inherit rpm

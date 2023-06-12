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

PV = "20.23.0"

RPM_NAME = "python310-virtualenv-20.23.0-1.1.noarch.rpm"
RPM_HASH = "6a6bb6e5a4d853e7a50c92949e7f16249520a1abb8e54b1ac76e251d147443837d83e71a18181a6201c8ba420833789c4ed6528fbfeffd92b502cf02be2bcda8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtualenv \
python3.10dist(virtualenv) \
python310-virtualenv \
python3dist(virtualenv)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-distlib \
python310-filelock \
python310-platformdirs \
update-alternatives"

inherit rpm

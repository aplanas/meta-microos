SUMMARY = "Function-driven python GUI programming"
DESCRIPTION = "EasyGui provides an interface for simple GUI interaction with a user. \
It's not event-driven and it does not require the programmer to know \
anything about tkinter, frames, widgets, callbacks or lambda."
LICENSE = "BSD-3-Clause"

PV = "0.98.3"

RPM_NAME = "python39-easygui-0.98.3-1.5.noarch.rpm"
RPM_HASH = "32430c57e67bd15f1e6f2b5cf3fad13667232334eea815fffce0d9d94d90a22bf71ec70eab90c25772e9cbde658d7372306a9495808a105bd5eff7299bb423d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(easygui) \
python39-easygui \
python3dist(easygui)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

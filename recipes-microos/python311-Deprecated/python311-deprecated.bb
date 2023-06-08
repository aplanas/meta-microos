SUMMARY = "Python @deprecated decorator"
DESCRIPTION = "If you need to mark a function or a method as deprecated, \
you can use the ``@deprecated`` decorator."
LICENSE = "MIT"

PV = "1.2.13"

RPM_NAME = "python311-Deprecated-1.2.13-3.1.noarch.rpm"
RPM_HASH = "e8f15069c570fcb6047b8385e36eb7e2398ecf84128fd44f5e0dbff9e3a6f312a08b2169cebdb73866a42b1b068eb93fef89ae35cf20c76fc7a32a4d93374196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(deprecated) python311-Deprecated python311-deprecated python3dist(deprecated)"
RDEPENDS:${PN} += "python(abi) python311-wrapt"

inherit rpm
